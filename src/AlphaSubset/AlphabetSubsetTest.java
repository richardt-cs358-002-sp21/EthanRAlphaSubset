/**
 * Ethan Reed CS358 SPRING 2021
 */
package AlphaSubset;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * @author ReedEthan
 *
 */
class AlphabetSubsetTest {

  /**
   * @throws java.lang.Exception
   */
  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception {
  }
  
  @Test
  void constructorTest() {
    AlphabetSubset test1 = new AlphabetSubset("oh i get it");
    Assertions.assertNotNull(test1);
  }
  
  @Test
  void findSimpleSubset() {
    AlphabetSubset test1 = new AlphabetSubset("abcde");
    ArrayList<Character> subset = test1.findsubset();
    
    ArrayList<Character> expected = new ArrayList<Character>();
    expected.add('a');
    expected.add('b');
    expected.add('c');
    expected.add('d');
    expected.add('e');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findComplexSubset() {
    AlphabetSubset test1 = new AlphabetSubset("bcdddfgh");
    ArrayList<Character> subset = test1.findsubset();
    
    ArrayList<Character> expected = new ArrayList<Character>();
    expected.add('b');
    expected.add('c');
    expected.add('d');
    expected.add('d');
    expected.add('d');
    expected.add('f');
    expected.add('g');
    expected.add('h');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }

  @Test
  void assertEquals(boolean expected, boolean actual) {
  }
  
  @Test
  void lowerCaseLettersAreValid() {
    AlphabetSubset subset = new AlphabetSubset("abcdefghijklmnopqrstuvwxyz");
    Assert.assertEquals(subset.getPhrase(), "abcdefghijklmnopqrstuvwxyz");
  }
  
  @Test
  void validSymbols() {
    AlphabetSubset subset = new AlphabetSubset(" !\"#$%&'()*,-.:;?@");
    Assert.assertEquals(subset.getPhrase(), " !\"#$%&'()*,-.:;?@");
  }
  
}
