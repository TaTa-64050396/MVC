import javax.swing.*;// นำเข้าไลบรารีสำหรับการสร้าง UI
import java.awt.event.ActionEvent;// นำเข้าไลบรารีสำหรับการจัดการกับ event ของปุ่ม
import java.awt.event.ActionListener;// นำเข้าไลบรารีสำหรับการสร้างตัวฟังชัน listener ที่จะคอยรับฟัง event ต่าง ๆ

public class PinkCowView extends JFrame {// สร้างคลาส PinkCowView ซึ่งเป็นหน้าต่าง UI ที่สืบทอดมาจาก JFrame
    private JTextField cowIdField, farmIdField, firstNameField, lastNameField;// ประกาศตัวแปร JTextField สำหรับกรอกข้อมูล Cow ID, Farm ID, และ Mother ID
    private JButton submitButton;// ประกาศตัวแปร JButton สำหรับปุ่ม "Register"

    public PinkCowView() {// คอนสตรัคเตอร์ของคลาส PinkCowView
        setTitle("Pink Cow Registration");// กำหนดชื่อของหน้าต่างเป็น "Pink Cow Registration"
        setSize(400, 300);// กำหนดขนาดของหน้าต่างเป็น 400x300 พิกเซล
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// กำหนดให้ปิดหน้าต่างโดยซ่อนเมื่อกดปุ่มปิด
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));// จัด Layout ของ UI ให้เป็นแบบแนวตั้ง

        add(new JLabel("Cow ID (8 digits):"));// เพิ่ม Label "Cow ID (8 digits):" ลงในหน้าต่าง
        cowIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Cow ID
        add(cowIdField);// เพิ่ม JTextField สำหรับกรอก Cow ID ลงในหน้าต่าง

        add(new JLabel("Farm ID (1 digit):"));// เพิ่ม Label "Farm ID (1 digit):" ลงในหน้าต่าง
        farmIdField = new JTextField();// สร้าง JTextField สำหรับกรอก Farm ID
        add(farmIdField);// เพิ่ม JTextField สำหรับกรอก Farm ID ลงในหน้าต่าง

        add(new JLabel("Owner's First Name (English):"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Owner's Last Name (English):"));
        lastNameField = new JTextField();
        add(lastNameField);

        submitButton = new JButton("Register");// สร้างปุ่ม "Register"
        add(submitButton);// เพิ่มปุ่ม "Register" ลงในหน้าต่าง

        submitButton.addActionListener(new ActionListener() {// เพิ่ม ActionListener ให้กับปุ่ม "Register"
            public void actionPerformed(ActionEvent e) {
                String cowId = cowIdField.getText();
                String farmId = farmIdField.getText();
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                if (Model.isValidCowId(cowId) && Model.isValidFarmId(farmId) && isValidName(firstName, lastName)) {
                    JOptionPane.showMessageDialog(null, "Pink cow registered successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid data. Please try again.");
                }
            }
        });
    }

    private boolean isValidName(String firstName, String lastName) {
        return firstName.matches("[a-z]{1,8}") && lastName.matches("[a-z]{1,8}");
    }
}


