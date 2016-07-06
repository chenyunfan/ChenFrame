package Main;
/** 
 * AppleµçÄÔ 
 * @author mrsimple 
 * 
 */  
public class AppleComputer extends Computer {  
  
    protected AppleComputer() {  
  
    }  
  
    @Override  
    public void setCPU(int core) {  
        mCpuCore = core;  
    }  
  
    @Override  
    public void setRAM(int gb) {  
        mRamSize = gb;  
    }  
  
    @Override  
    public void setOs(String os) {  
        mOs = os;  
    }  
  
}  