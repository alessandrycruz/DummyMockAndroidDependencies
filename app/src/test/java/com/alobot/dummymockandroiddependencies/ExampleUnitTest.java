package com.alobot.dummymockandroiddependencies;

import android.content.Context;

import com.alobot.dummymockandroiddependencies.utils.ClassUnderTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    private static final String FAKE_STRING = "HELLO WORLD";

    @Mock
    private Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {
        // Given a Mocked Context injected into the object under test
        when(mMockContext.getString(R.string.hello_world)).thenReturn(FAKE_STRING);

        // When the string is returned from the object under test
        ClassUnderTest myObjectUnderTest = new ClassUnderTest(mMockContext);
        String result = myObjectUnderTest.getHelloWorldString();

        // Then the result should be the expected one
        assertThat(result, is(FAKE_STRING));
    }
}