
package javaproject;

/**
 *
 * @author Jamie
 */
public interface Calculator <T extends Number> {
    
    double calculateFees(T clubID);
    
}
