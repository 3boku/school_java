package j0629;

public class TV implements Sound {
    private int tv_sound;



    @Override
    public void SoundUp(int level){
        tv_sound += (level * 2);
        System.out.println("티비 업: " + tv_sound);
    }

    @Override
    public void SoundDown(int level){
        tv_sound -= (level*2);
        if(tv_sound<0){
            tv_sound = 0;
        }
        System.out.println("티비 다운: " + tv_sound);
    }
    
    public int getTV_Sound(){
        return tv_sound;
    }
}
