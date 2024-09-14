import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BrownCowView extends JFrame {// สร้างคลาส BrownCowView ซึ่งเป็นหน้าต่าง UI ที่สืบทอดมาจาก JFrame
    private JTextField cowIdField, farmIdField, motherIdField;// ประกาศตัวแปร JTextField สำหรับกรอกข้อมูล Cow ID, Farm ID, และ Mother ID
    private JButton submitButton;// ประกาศตัวแปร JButton สำหรับปุ่ม "Register"

    public BrownCowView() {// คอนสตรัคเตอร์ของคลาส BrownCowView
        setTitle("Brown Cow Registration");// กำหนดชื่อของหน้าต่างเป็น "Brown Cow Registration"
        setSize(400, 300);// กำหนดขนาดของหน้าต่างเป็น 400x300 พิกเซล
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// กำหนดให้ปิดหน้าต่างโดยซ่อนเมื่อกดปุ่มปิด
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));// จัด Layout ของ UI ให้เป็นแบบแนวตั้ง

        add(new JLabel("Cow ID (8 digits):"));// เพิ่ม Label "Cow ID (8 digits):" ลงในหน้าต่าง
        cowIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Cow ID
        add(cowIdField);// เพิ่ม JTextField สำหรับกรอก Cow ID ลงในหน้าต่าง

        add(new JLabel("Farm ID (1 digit):"));// เพิ่ม Label "Farm ID (1 digit):" ลงในหน้าต่าง
        farmIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Farm ID
        add(farmIdField);// เพิ่ม JTextField สำหรับกรอก Farm ID ลงในหน้าต่าง

        add(new JLabel("Mother ID (8 digits):"));// เพิ่ม Label "Mother ID (8 digits):" ลงในหน้าต่าง
        motherIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Mother ID
        add(motherIdField);// เพิ่ม JTextField สำหรับกรอก Mother ID ลงในหน้าต่าง

        submitButton = new JButton("Register");// สร้างปุ่ม "Register"
        add(submitButton);// เพิ่มปุ่ม "Register" ลงในหน้าต่าง

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cowId = cowIdField.getText();
                String farmId = farmIdField.getText();
                String motherId = motherIdField.getText();

                if (Model.isValidCowId(cowId) && Model.isValidFarmId(farmId) && Model.isValidCowId(motherId)) {
                    JOptionPane.showMessageDialog(null, "Brown cow registered successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid data. Please try again.");
                }
            }
        });
    }
}

