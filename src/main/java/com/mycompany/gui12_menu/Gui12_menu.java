/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui12_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Gui12_menu {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Menü Örneği");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Ana menü");
        JMenu Submenu = new JMenu("Alt menü");

        JMenuItem i1 = new JMenuItem("Menü 1");
        JMenuItem i2 = new JMenuItem("Menü 2");
        JMenuItem i3 = new JMenuItem("Menü 3");
        JMenuItem i4 = new JMenuItem("Menü 4");
        JMenuItem i5 = new JMenuItem("Menü 5");

        JMenuItem a1 = new JMenuItem("AltMenü 1");
        JMenuItem a2 = new JMenuItem("AltMenü 2");

        Submenu.add(a1);
        Submenu.add(a2);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(Submenu);

        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Menüye tıklandı");
            }
        });

        mb.add(menu);
        frame.setJMenuBar(mb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
