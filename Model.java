public class Model {// สร้างคลาส Model ซึ่งจะเก็บข้อมูลและจัดการกับข้อมูล
    private String cowId;// ประกาศตัวแปร cowId เพื่อเก็บค่า ID ของวัว
    private String farmId;// ประกาศตัวแปร farmId เพื่อเก็บค่า ID ของฟาร์ม

    public Model(String cowId, String farmId) {
        this.cowId = cowId;
        this.farmId = farmId;
    }

    public String getCowId() {// เมธอดสำหรับดึงค่า ID ของวัว
        return cowId;// คืนค่าตัวแปร cowId
    }

    public String getFarmId() {// เมธอดสำหรับดึงค่า ID ของฟาร์ม
        return farmId;// คืนค่าตัวแปร farmId
    }

    public static boolean isValidCowId(String cowId) {
        return cowId.matches("[1-9][0-9]{7}");
    }

    public static boolean isValidFarmId(String farmId) {
        return farmId.matches("[1-9]");
    }
}




