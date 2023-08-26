package tobi_Spring.Chapter002_Ex001_junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

import org.junit.Test;

//테스트 수행시 매번 다른 인스턴스를 생성한다.
public class Main_refactoring_03 {

		static Main_refactoring_03 testObject; 
		
		@Test public void test1() {
			assertThat(this, is(not(sameInstance(testObject))));
			testObject = this; 
		}
		
		@Test public void test2() {
			assertThat(this, is(not(sameInstance(testObject))));
			testObject = this; 
		}
		
		@Test public void test3() {
			assertThat(this, is(not(sameInstance(testObject))));
			testObject = this; 
		}

}
