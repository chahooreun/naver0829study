package bit701.day0918;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ComboBoxEx extends JFrame{
    String[] fruits={"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
    String[] name={"kim", "jhon", "hyosoo", "namyun"};
    ComboBoxEx(){
        this.setTitle("콤보박스 만들기 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        JComboBox strCombo= new JComboBox(fruits);
        this.add(strCombo);
        
        JComboBox nameCombo = new JComboBox(name);
        this.add(nameCombo);
        
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setVisible(true);
    }
}
public class Ex1_ComboBox {
    public static void main(String[] args) {
        new ComboBoxEx();
    }
}
