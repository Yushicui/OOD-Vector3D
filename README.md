# 3D Vector Operations and Implementation - Object-Oriented Design

### <br>**Overview**<br>
This project focuses on providing an intuitive implementation for handling 3D vectors. 
The Vector3D class offers fundamental vector operations, such as computing the magnitude, 
normalization, vector addition, multiplication, and determining the dot product, angle, and cross product between vectors.

### **Core Components**
- Constructor: Takes in three double parameters representing the x, y, and z components of a 3D vector.
- Component Getters: getX, getY, and getZ methods to retrieve individual components of the vector.
- ToString Method: Returns a well-formatted string representation of the vector, rounding each component to two decimal places.
- getMagnitude: Computes the magnitude of the vector using its components.
- normalize: Returns a normalized version of the vector. If the operation can't be completed, it throws an IllegalStateException.
- add: Takes another vector and returns the vector sum without mutating the original vectors.
- multiply: Multiplies the vector with a constant without changing the original vector.
- dotProduct: Computes the dot product with another vector without mutating either.
- angleBetween: Calculates the smaller angle between two vectors in degrees, throwing an IllegalStateException if it can't be completed.
- crossProduct: Determines the cross product with another vector without changing either of the vectors involved.

### **Key Takeaways**<br>
- Immutable Design: The methods in the Vector3D class are implemented in such a way that they don't mutate the original vectors, promoting an immutable design.
- Comprehensive Operations: The class covers a wide range of vector operations, from basic component retrieval to more complex mathematical computations like cross product and angle determination.
- Error Handling: The system has been designed to handle edge cases and potential errors by throwing appropriate exceptions, ensuring robustness and meaningful feedback.
- String Formatting: The toString method leverages Java's String.format for precise rounding and formatting, ensuring consistent and readable vector representations.

### **Summary**<br>
The 3D Vector Operations and Implementation project offers a comprehensive approach to handling 3D vectors in mathematics and physics. 
Through the Vector3D class, users can effortlessly perform a myriad of vector operations, from simple tasks like retrieving components to complex operations such as cross products. 
The emphasis on immutability and error handling ensures the class is not only efficient but also user-friendly.
