/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author estev
 */
public class Validador extends PlainDocument {
    
    private final int limite;
    
    public Validador(int limite) {
        super();
        this.limite = limite;
    }
    
    public void insertString(int ofs, String str, AttributeSet a) throws BadLocationException {
        
        if ((getLength() + str.length()) <= limite) {
            super.insertString(ofs, str, a);
            
        }
        
    }
}
