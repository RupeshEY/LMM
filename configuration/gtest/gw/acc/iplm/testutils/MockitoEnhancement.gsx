package gw.acc.iplm.testutils

uses org.hamcrest.Matcher
uses org.mockito.Mockito
uses org.mockito.internal.matchers.Any
uses org.mockito.internal.progress.HandyReturnValues
uses org.mockito.internal.progress.ThreadSafeMockingProgress
uses org.mockito.internal.verification.VerificationModeFactory
uses org.mockito.stubbing.Answer
uses org.mockito.stubbing.OngoingStubbing
uses org.mockito.stubbing.Stubber
uses org.mockito.verification.VerificationMode

/**
 * Enhancement to handle static imports of Mockito methods<br>
 * To use in your test class implement the {@link MockitoStatics} interface<br>
 * Developed against Mockito 1.10.19
 */
enhancement MockitoEnhancement: MockitoStatics {

  function mock<T>(classToMock : Class<T>) : T {
    return Mockito.mock(classToMock)
  }

  function verify<T>(mock : T, mode : VerificationMode) : T {
    return Mockito.verify(mock, mode)
  }

  function when<T>(methodCall : T) : OngoingStubbing<T> {
    return Mockito.when(methodCall)
  }

  function times(wantedNumberOfInvocations : int) : VerificationMode {
    return VerificationModeFactory.times(wantedNumberOfInvocations)
  }

  function never() : VerificationMode {
    return times(0)
  }

  function any<T>(clazz : Class<T>) : T {
    return reportMatcher(Any.ANY).returnFor(clazz)
  }

  private function reportMatcher(matcher : Matcher<Object>): HandyReturnValues {
    return new ThreadSafeMockingProgress().getArgumentMatcherStorage().reportMatcher(matcher)
  }

  function doAnswer<T>(answer : Answer<T>) : Stubber {
    return Mockito.doAnswer(answer)
  }

}
