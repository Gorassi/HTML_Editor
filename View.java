package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {    }

    public void initMenuBar(){}

    public void initEditor(){}

    public void initGui(){
        initMenuBar();
        initEditor();
        pack();
    }

    public void init(){
        initGui();
//        JFrame frame = new JFrame("My panel");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
        addWindowListener(new FrameListener(this));
        setVisible(true);
    }

    public void exit(){
        controller.exit();;
    }
}
