/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author Sebastian
 */
public class CustomException extends Exception {
    
    private static final long serialVersionUID = 700L;

    public CustomException(String message) {
        super(message);
    }
    
}
