package j0629;

public class Radio implements Sound{
    private int R_Sound;

    @Override
    public void SoundUp(int level){
        R_Sound += level;
        System.out.println("라디오업: " + R_Sound);
    }

    @Override
    public void SoundDown(int level){
        R_Sound -= level;
        if(R_Sound<0){
            R_Sound = 0;
        }
        System.out.println("라디오다운: " + R_Sound);
    }

    public int getR_Sound(){
        return R_Sound;
    }
}
