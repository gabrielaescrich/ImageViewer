package us;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFrame extends JFrame{
    private ImageViewer imageViewer;
    private ActionListenerFactory factory;

    public AppFrame(ActionListenerFactory factory) {
        super("Image Viewer");
        this.factory = factory;
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createComponents();
    }

    private void createComponents() {
        this.add(createToolbar(), BorderLayout.SOUTH);
        this.add(createImagePanel());
    }

    private Component createToolbar() {
        JPanel panel = new JPanel();
        panel.add(createButton("Prev"));
        panel.add(createButton("Next"));
        return panel;
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(factory.create(label));
        return button;
    }

    private JPanel createImagePanel() {
        ImagePanel panel = new ImagePanel();
        imageViewer = panel;
        return panel;
    }
    
    
}
