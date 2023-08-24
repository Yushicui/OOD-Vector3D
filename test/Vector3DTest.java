/**
 * CS5004 Project 1
 * Name: Yushi Cui
 */

package project01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A JUnit test class for the Vector3D class.
 */
class Vector3DTest {

  /**
   * Tests the getX method.
   */
  @Test
  public void testGetX(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    assertEquals(3.0, vectorV.getX());
  }

  /**
   * Tests the getY method.
   */
  @Test
  public void testGetY(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    assertEquals(4.0, vectorV.getY());
  }

  /**
   * Tests the getZ method.
   */
  @Test
  public void testGetZ(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    assertEquals(5.0, vectorV.getZ());
  }

  /**
   * Tests the toString method.
   */
  @Test
  public void testToString(){
    Vector3D vectorV = new Vector3D(3.6894, 4.2355, 5.4354);
    assertEquals("(3.69, 4.24, 5.44)", vectorV.toString());

    Vector3D vectorV2 = new Vector3D(3, 4, 5);
    assertEquals("(3.00, 4.00, 5.00)", vectorV2.toString());
  }

  /**
   * Tests the getMagnitude method.
   */
  @Test
  public void testGetMagnitude(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    assertEquals(7.071, vectorV.getMagnitude(),0.01);
    Vector3D vectorV2 = new Vector3D(0.0, 0.0, 0.0);
    assertEquals(0, vectorV2.getMagnitude(),0.01);
  }

  /**
   * Tests the normalize method.
   */
  @Test
  public void testNormalize(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    Vector3D normalized = vectorV.normalize();
    assertEquals(3.0/7.071,normalized.getX(),0.01);
    assertEquals(4.0/7.071,normalized.getY(),0.01);
    assertEquals(5.0/7.071,normalized.getZ(),0.01);
    /**
     * Tests the normalize method with exception.
     */
    Vector3D vectorV2 = new Vector3D(0.0, 0.0, 0.0);
    assertThrows(IllegalStateException.class, () -> vectorV2.normalize());
  }

  /**
   * Tests the add method.
   */
  @Test
  public void testAdd(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    Vector3D vectorW = new Vector3D(1.0, 1.0, 2.0);
    Vector3D added = vectorV.add(vectorW);
    assertEquals(4.0, added.getX());
    assertEquals(5.0, added.getY());
    assertEquals(7.0, added.getZ());
  }

  /**
   * Tests the multiply method.
   */
  @Test
  public void testMultiply(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    Vector3D multiplied = vectorV.multiply(2);
    assertEquals(6.0, multiplied.getX());
    assertEquals(8.0, multiplied.getY());
    assertEquals(10.0, multiplied.getZ());
  }

  /**
   * Tests the dotProduct method.
   */
  @Test
  public void testDotProduct(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    Vector3D vectorW = new Vector3D(1.0, 1.0, 2.0);
    assertEquals(17.0, vectorV.dotProduct(vectorW),0.01);

    Vector3D vectorV2 = new Vector3D(0.0, 0.0, 0.0);
    Vector3D vectorW2 = new Vector3D(1.0, 1.0, 2.0);
    assertEquals(0.0, vectorV2.dotProduct(vectorW2),0.01);
  }

  /**
   * Tests the angleBetween method.
   */
  @Test
  public void testAngleBetween(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    Vector3D vectorW = new Vector3D(1.0, 1.0, 2.0);
    assertEquals(11.039, vectorV.angleBetween(vectorW),0.01);
    /**
     * Tests the angleBetween method with exception.
     */
    Vector3D vectorV2 = new Vector3D(0.0, 0.0, 0.0);
    Vector3D vectorW2 = new Vector3D(1.0, 1.0, 2.0);
    assertThrows(IllegalStateException.class, () -> vectorV2.angleBetween(vectorW2));
  }

  /**
   * Tests the crossProduct method.
   */
  @Test
  public void testCrossProduct(){
    Vector3D vectorV = new Vector3D(3.0, 4.0, 5.0);
    Vector3D vectorW = new Vector3D(1.0, 1.0, 2.0);
    Vector3D crossproduct = vectorV.crossProduct(vectorW);
    assertEquals(3.0, crossproduct.getX());
    assertEquals(-1.0, crossproduct.getY());
    assertEquals(-1.0, crossproduct.getZ());

    Vector3D vectorV2 = new Vector3D(3.0, 4.0, 5.0);
    Vector3D vectorW2 = new Vector3D(0.0, 0.0, 3.0);
    Vector3D crossproduct2 = vectorV2.crossProduct(vectorW2);
    assertEquals(12.0, crossproduct2.getX());
    assertEquals(-9.0, crossproduct2.getY());
    assertEquals(0.0, crossproduct2.getZ());
  }
}