package Main.builder;
public class Director {  
    Builder mBuilder = null;  
  
    /** 
     *  
     * @param builder 
     */  
    public Director(Builder builder) {  
        mBuilder = builder;  
    }  
  
    /** 
     * �������� 
     *  
     * @param cpu 
     * @param ram 
     * @param os 
     */  
    public void construct(int cpu, int ram, String os) {  
        mBuilder.buildCPU(cpu);  
        mBuilder.buildRAM(ram);  
        mBuilder.buildOs(os);  
    }  
}  