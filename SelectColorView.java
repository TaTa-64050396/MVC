import javax.swing.*;// นำเข้าไลบรารีสำหรับการสร้าง UI
import java.awt.event.ActionEvent;// นำเข้าไลบรารีสำหรับการจัดการกับ event ของปุ่ม
import java.awt.event.ActionListener;// นำเข้าไลบรารีสำหรับการสร้างตัวฟังชัน listener ที่จะคอยรับฟัง event ต่าง ๆ

public class SelectColorView extends JFrame {// สร้างคลาส SelectColorView ซึ่งเป็นหน้าต่าง UI ที่สืบทอดมาจาก JFrame
    private Control controller;
    private JButton whiteCowButton, brownCowButton, pinkCowButton;// ประกาศปุ่ม JButton สำหรับเลือกสีน้ำตาล สีขาว และสีชมพู

    public SelectColorView(Control controller) {// คอนสตรัคเตอร์ของคลาส SelectColorView
        this.controller = controller;
        setTitle("Select Cow Color");// กำหนดชื่อของหน้าต่างเป็น "Select Cow Color"
        setSize(300, 200);// กำหนดขนาดของหน้าต่างเป็น 300x200 พิกเซล
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// กำหนดให้ปิดโปรแกรมเมื่อปิดหน้าต่าง
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));// จัด Layout ของ UI ให้เป็นแบบแนวตั้ง

        JLabel label = new JLabel("Please select the cow color for registration");
        add(label);

        whiteCowButton = new JButton("White Cow");// สร้างปุ่ม "White Cow"
        brownCowButton = new JButton("Brown Cow");// สร้างปุ่ม "Brown Cow"
        pinkCowButton = new JButton("Pink Cow");// สร้างปุ่ม "Pink Cow"

        add(whiteCowButton);// เพิ่มปุ่ม "White Cow" ลงในหน้าต่าง
        add(brownCowButton);// เพิ่มปุ่ม "Brown Cow" ลงในหน้าต่าง
        add(pinkCowButton);// เพิ่มปุ่ม "Pink Cow" ลงในหน้าต่าง

        whiteCowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.showWhiteCowView();
            }
        });

        brownCowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.showBrownCowView();
            }
        });

        pinkCowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.showPinkCowView();
            }
        });
    }
}



