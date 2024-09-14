public class Control {
    private SelectColorView selectColorView;// ประกาศตัวแปร selectColorView สำหรับหน้าต่าง UI ที่ให้เลือกสี
    private WhiteCowView whiteCowView;// ประกาศตัวแปร whiteCowView สำหรับหน้าต่าง UI ของ White Cow
    private BrownCowView brownCowView;// ประกาศตัวแปร brownCowView สำหรับหน้าต่าง UI ของ Brown Cow
    private PinkCowView pinkCowView;// ประกาศตัวแปร pinkCowView สำหรับหน้าต่าง UI ของ Pink Cow

    public Control() {
        selectColorView = new SelectColorView(this);
        whiteCowView = new WhiteCowView();
        brownCowView = new BrownCowView();
        pinkCowView = new PinkCowView();
    }

    public void showSelectColorView() {
        selectColorView.setVisible(true);
    }

    public void showWhiteCowView() {
        whiteCowView.setVisible(true);
    }

    public void showBrownCowView() {
        brownCowView.setVisible(true);
    }

    public void showPinkCowView() {
        pinkCowView.setVisible(true);
    }
}



