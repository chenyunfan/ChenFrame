package Main;
/** 
 * builder������ 
 *  
 * @author mrsimple 
 * 
 */  
public abstract class Builder {  
    // ����CPU������  
    public abstract void buildCPU(int core);  
  
    // �����ڴ�  
    public abstract void buildRAM(int gb);  
  
    // ���ò���ϵͳ  
    public abstract void buildOs(String os);  
  
    // ����Computer  
    public abstract Computer create();  
  
}  