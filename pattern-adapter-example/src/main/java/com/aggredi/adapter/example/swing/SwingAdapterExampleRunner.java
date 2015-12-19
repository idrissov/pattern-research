package com.aggredi.adapter.example.swing;

/**
 * Created by Serik Idrissov
 * 12/19/15
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class SwingAdapterExampleRunner extends JFrame {

    public SwingAdapterExampleRunner() {
        super("Adapter Example");

        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        ComboBoxListAdapter comboBoxListAdapter = new ComboBoxListAdapter(defaultComboBoxModel);
        JList list = new JList(comboBoxListAdapter);
        JScrollPane scrollList = new JScrollPane(list);
        scrollList.setMinimumSize(new Dimension(100, 80));
        Box listBox = new Box(BoxLayout.Y_AXIS);
        listBox.add(scrollList);
        listBox.add(new JLabel("List"));

        JComboBox jComboBox = new JComboBox(defaultComboBoxModel);

        JScrollPane scrollTable = new JScrollPane(jComboBox);
        scrollTable.setColumnHeader(null);
        scrollTable.setMinimumSize(new Dimension(100, 80));
        Box tableBox = new Box(BoxLayout.Y_AXIS);
        tableBox.add(scrollTable);
        tableBox.add(new JLabel("Adaptee"));

        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
        c.add(listBox);
        c.add(new JSeparator(SwingConstants.VERTICAL));
        c.add(tableBox);

        JScrollPane panel = new JScrollPane();
        JTextField textField = (JTextField) panel.add(new JTextField(10));
        textField.setEditable(true);

        tableBox.setEnabled(true);
        Button button = (Button) panel.add(new Button("Add"));
        button.setVisible(true);
        button.addActionListener(e -> {
            String text = textField.getText();
            if (text == null || "".equals(text)) {
                return;
            }
            ((ComboBoxListAdapter)list.getModel()).addElement(text);
            textField.setText("");
        });

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(textField);
        controlPanel.add(button);
        c.add(controlPanel);
        setSize(500, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        final SwingAdapterExampleRunner swingAdapterExampleRunner = new SwingAdapterExampleRunner();
        swingAdapterExampleRunner.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
