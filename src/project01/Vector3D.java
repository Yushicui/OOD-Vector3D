/**
 * CS5004 Project 1
 * Name: Yushi Cui
 *
 * I used ChatGPT for problem 9, I asked ChatGPT to write a Java method that returns the angle between two 3D vectors in degrees.
 */

package project01;
import java.lang.Math;

/**
 * This class represents a 3D vector. A vector has an x, a y and a z.
 */
public class Vector3D {
  private double x = 0.0;
  private double y = 0.0;
  private double z = 0.0;

  /**
   * Construct a vector object with the given x, y, and z components.
   *
   * @param x the x component
   * @param y the y component
   * @param z the z component
   */
  public Vector3D (double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Return the value of x component in the vector.
   *
   * @return the value of x component
   */
  public double getX() {
    return this.x;
  }

  /**
   * Return the value of y component in the vector.
   *
   * @return the value of y component
   */
  public double getY() {
    return this.y;
  }

  /**
   * Return the value of z component in the vector.
   *
   * @return the value of z component
   */
  public double getZ() {
    return this.z;
  }

  /**
   * Returns a string that describes the vector, with each component round up to two decimal places
   *
   * @return a string of the form "(x, y, z)"
   */
  public String toString() {
    String string = String.format(
            "(%.2f, %.2f, %.2f)",
            this.x, this.y, this.z);
    return string;
  }

  /**
   * Return the magnitude of the vector.
   *
   * @return the magnitude
   */
  public double getMagnitude() {
    double magnitude = Math.sqrt(
            Math.pow(this.x, 2) +
            Math.pow(this.y, 2) +
            Math.pow(this.z, 2));
    return magnitude;
  }

  /**
   * Return the normalized version of this vector.
   *
   * @return the normalized vector
   * @throws IllegalStateException if the vector cannot be normalized.
   */
  public Vector3D normalize() {
    if(getMagnitude() == 0){
      throw new IllegalStateException("Cannot normalize vector with 0 magnitude");
    }
    return new Vector3D(
            this.x/getMagnitude(),
            this.y/getMagnitude(),
            this.z/getMagnitude());
  }

  /**
   * Return the result of adding this vector to another vector.
   *
   * @param vectorW the vector to be added
   * @return the result vector after the addition
   */
  public Vector3D add(Vector3D vectorW) {
    return new Vector3D(
            this.x + vectorW.x,
            this.y + vectorW.y,
            this.z + vectorW.z);
  }

  /**
   * Return the result of multiplying this vector by a constant.
   *
   * @param constant the constant to be multiplied
   * @return the result vector after the multiplication
   */
  public Vector3D multiply(double constant) {
    return new Vector3D(
            this.x * constant,
            this.y * constant,
            this.z * constant);
  }

  /**
   * Return the dot product of this vector and another vector.
   *
   * @param vectorW the another vector to perform the dot product
   * @return the value of the dot product
   */
  public double dotProduct(Vector3D vectorW) {
    return (this.x * vectorW.x +
            this.y * vectorW.y +
            this.z * vectorW.z);
  }

  /**
   * Return the angle between two vectors in degrees.
   *
   * @param vectorW the another vector
   * @return the angle in degrees
   * @throws IllegalStateException if the operation cannot be completed.
   */
  public double angleBetween(Vector3D vectorW) {
    double dotproduct = this.dotProduct(vectorW);
    double magnitudes = this.getMagnitude() * vectorW.getMagnitude();
      if (magnitudes == 0) {
      throw new IllegalStateException("Cannot calculate angle with 0 magnitude vector");
    } else {
      double angle = Math.acos(dotproduct / magnitudes);
      return Math.toDegrees(angle);
    }
  }

  /**
   * Return the cross product of this vector and another vector.
   *
   * @param vectorW the vector to perform the cross product
   * @return the result vector of the cross product
   */
  public Vector3D crossProduct(Vector3D vectorW) {
    double Ux = (this.y * vectorW.z) - (this.z * vectorW.y);
    double Uy = (this.z * vectorW.x) - (this.x * vectorW.z);
    double Uz = (this.x * vectorW.y) - (this.y * vectorW.x);
    return new Vector3D(Ux, Uy, Uz);
  }
}
