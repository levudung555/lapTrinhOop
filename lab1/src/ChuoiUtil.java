public class ChuoiUtil {
    private String chuoiGoc;
    StringBuilder Sb = new StringBuilder();
    public ChuoiUtil(String chuoiGoc) {
        this.chuoiGoc = chuoiGoc;
    }
    public String daoNguocChuoi( ){
        // toString dùng để trả lại kiểu String ban đầu cho chuoiGoc
        return new StringBuilder(chuoiGoc).reverse().toString();
    }
    public int dem (){
        String tmp = chuoiGoc.trim();
        if(tmp.isEmpty())return 0;
        // \\s+ để tránh nhiều khoảng trăng liên tiếp
        String[] words = tmp.split("\\s+");

        return words.length;
    }
    public String chuanHoaChuoi(){
        String tmp = chuoiGoc.trim();
        if(tmp.isEmpty())return null;
        String [] st = tmp.split("\\s+");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<st.length;i++){
            // chuển tất cả thành chữ viết thường
          String w =  st[i].toLowerCase();
          // viết hoa chữ cái đầu và thêm các phần tử còn lại vào chuỗi
          sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
          // thêm khoảng trắng vào sau mỗi chuỗi
          if(i<st.length-1) sb.append(" ");
        }
    return sb.toString();
    }

}
