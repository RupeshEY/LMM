@echo off

setlocal enableDelayedExpansion

set APP_PREFIX=cc
set DOC_TYPE=claimcontact
set BASE_DIR=c:\opt\gwsolr
set GWENV=

set GWSOLR_HOME=%BASE_DIR%\%APP_PREFIX%

set JAVA_OPTS=
set LIBDIR=%GWSOLR_HOME%\lib
set SOLRLIBDIR=%GWSOLR_HOME%\%APP_PREFIX%-gwsolr\WEB-INF\lib
set SERVLETJAR=c:\opt\apache-tomcat\lib\servlet-api.jar
set TRANSFORMERLIBDIR=%LIBDIR%
set CONFIGFILE=%GWSOLR_HOME%\solr\%DOC_TYPE%_active\conf\batchload-config.xml
rem set DEBUG=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005

call :buildpath %LIBDIR% JARS
call :buildpath %SOLRLIBDIR% SOLRJARS

rem If you define transformer classes, archive them in a jar and place the jar and any required dependent jars
rem in the directory pointed to by the TRANSFORMERLIBDIR environment variable.
rem
rem   set TRANSFORMERJARS=%TRANSFORMERLIBDIR%\Foo.jar
rem

rem Only needed if TRANSFORMERLIBDIR refers to a different directory than LIBDIR
if not "X"%LIBDIR% == "X"%TRANSFORMERLIBDIR% (
  call :buildpath %TRANSFORMERLIBDIR% TRANSFORMERJARS
) else (
  set TRANSFORMERJARS=
)

if not "X"%GWENV% == "X" (
  set JAVA_OPTS=%JAVA_OPTS% -Dgw.%APP_PREFIX%.env=%GWENV%
)

java %DEBUG% %JAVA_OPTS% -cp .;%JARS%;%SOLRJARS%;%SERVLETJAR%;%TRANSFORMERJARS% com.guidewire.solr.batchload.SolrBatchLoader %CONFIGFILE% 2> solr-batchload.err
if errorlevel 1 echo Solr batchload failed.  Check solr-batchload.err for details.

exit /b

:buildpath
set _PVAR=
(for /f "delims=" %%a in ('dir /b /a-d %~1\*.jar') do (
  if "X"!_PVAR! == "X" (
    set _PVAR="%~1\%%a"
  ) else (
    set _PVAR=!_PVAR!;"%~1\%%a"
  )
))
set %~2=!_PVAR!
exit /b
