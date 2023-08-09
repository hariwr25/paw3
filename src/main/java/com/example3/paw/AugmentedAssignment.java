package com.example3.paw;

public class AugmentedAssignment {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 3;

        // Operasi aritmatika dengan augmented assignments
        x += 3; // x = x + 3; // x = 5 + 3; // x = 8
        y -= 2; // y = y - 2; // y = 10 - 2; // y = 8
        z *= 4; // z = z * 4; // z = 3 * 4; // z = 12

        // Operasi bitwise dengan augmented assignments
        x &= 2; // x = x & 2; // x = 8 & 2; // x = 0 (bentuk binernya: 0000)
        y |= 4; // y = y | 4; // y = 8 | 4; // y = 12 (bentuk binernya: 1100)
        z ^= 1; // z = z ^ 1; // z = 12 ^ 1; // z = 13 (bentuk binernya: 1101)

        System.out.println("x: " + x); // Output: x: 0
        System.out.println("y: " + y); // Output: y: 12
        System.out.println("z: " + z); // Output: z: 13
    }
}