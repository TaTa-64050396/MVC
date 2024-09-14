import javax.swing.*;// นำเข้าไลบรารีสำหรับการสร้าง UI
import java.awt.event.ActionEvent;// นำเข้าไลบรารีสำหรับการจัดการกับ event ของปุ่ม
import java.awt.event.ActionListener;// นำเข้าไลบรารีสำหรับการสร้างตัวฟังชัน listener ที่จะคอยรับฟัง event ต่าง ๆ

public class WhiteCowView extends JFrame {// สร้างคลาส WhiteCowView ซึ่งเป็นหน้าต่าง UI ที่สืบทอดมาจาก JFrame
    private JTextField cowIdField, farmIdField, yearsField, monthsField;// ประกาศตัวแปร JTextField สำหรับกรอกข้อมูล Cow ID, Farm ID, และ Mother ID
    private JButton submitButton; // ประกาศตัวแปร JButton สำหรับปุ่ม "Register"

    public WhiteCowView() {// คอนสตรัคเตอร์ของคลาส WhiteCowView
        setTitle("White Cow Registration");// กำหนดชื่อของหน้าต่างเป็น "White Cow Registration"
        setSize(400, 300);// กำหนดขนาดของหน้าต่างเป็น 400x300 พิกเซล
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// กำหนดให้ปิดหน้าต่างโดยซ่อนเมื่อกดปุ่มปิด
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));// จัด Layout ของ UI ให้เป็นแบบแนวตั้ง

        add(new JLabel("Cow ID (8 digits):"));// เพิ่ม Label "Cow ID (8 digits):" ลงในหน้าต่าง
        cowIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Cow ID
        add(cowIdField);// เพิ่ม JTextField สำหรับกรอก Cow ID ลงในหน้าต่าง

        add(new JLabel("Farm ID (1 digit):"));// เพิ่ม Label "Farm ID (1 digit):" ลงในหน้าต่าง
        farmIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Farm ID
        add(farmIdField);// เพิ่ม JTextField สำหรับกรอก Farm ID ลงในหน้าต่าง

        add(new JLabel("Age (years):"));
        yearsField = new JTextField();
        add(yearsField);

        add(new JLabel("Age (months):"));
        monthsField = new JTextField();
        add(monthsField);

        submitButton = new JButton("Register");// สร้างปุ่ม "Register"
        add(submitButton);// เพิ่มปุ่ม "Register" ลงในหน้าต่าง


        submitButton.addActionListener(new ActionListener() {// เพิ่ม ActionListener ให้กับปุ่ม "Register"
            public void actionPerformed(ActionEvent e) {// เมื่อปุ่มถูกคลิก
                String cowId = cowIdField.getText();
                String farmId = farmIdField.getText();
                int years = Integer.parseInt(yearsField.getText());
                int months = Integer.parseInt(monthsField.getText());

                if (Model.isValidCowId(cowId) && Model.isValidFarmId(farmId) && isValidAge(years, months)) {
                    JOptionPane.showMessageDialog(null, "White cow registered successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid data. Please try again.");
                }
            }
        });
    }

    private boolean isValidAge(int years, int months) {
        return years >= 0 && years <= 10 && months >= 0 && months <= 11;
    }
}


