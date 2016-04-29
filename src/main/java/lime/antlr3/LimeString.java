package lime.antlr3;

public class LimeString {
    String s;
    public LimeString(String s) { this.s = s; }

    public int getLengthInBytes() { return s.length(); }
    
    public String toString() {
        s = s.replaceAll("\\\\n", "\\\\0A");
        s = s.replaceAll("\\\\r", "\\\\0D");
        s = s + "\\00"; // null terminate strings 
        return s;
    }
}
