package AdapterDesignPattern;

//INTERFACE-1
interface AdvancedMediaPlayer
{
	public void playVlc(String fileName);
	public void playMp4(String fileName);
}

//INTERFACE-2
interface MediaPlayer
{
	public void play(String audiotype, String fileName);
}

//CLASS WHICH IMPLEMENTS INTERFACE-1. 
class VlcPlayer implements AdvancedMediaPlayer
{
	public void playVlc(String fileName)
	{
		System.out.println("playing vlc filename :"+fileName);
	}
	public void playMp4(String fileName)
	{
		//do nothing...
	}
}

//CLASS WHICH IMPLEMENTS INTERFACE-1.
class Mp4Player implements AdvancedMediaPlayer
{
	public void playVlc(String fileName)
	{
		//do nothing..
	}
	public void playMp4(String fileName)
	{
		System.out.println("playing mp4 filename :"+fileName);
	}
}

//CLASS WHICH IMPLEMENTS INTERFACE-2. 
class MediaAdapter implements MediaPlayer
{
	AdvancedMediaPlayer advancedMediaPlayer;

	public AdvancedMediaPlayer MediaPlayer(String audioType)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			advancedMediaPlayer = new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedMediaPlayer = new Mp4Player();
		}
		return advancedMediaPlayer;
	}
	
	public void play(String audioType, String fileName )
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			advancedMediaPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedMediaPlayer.playMp4(fileName);
		}
	}	
}

//CLASS WHICH IMPLEMENTS INTERFACE-2.
class AudioPlayer implements MediaPlayer
{
	MediaAdapter mediaAdapter;
	public void play(String audioType,String fileName)
	{
		if(audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("playing mp3 file name: "+fileName);
		}
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
		{
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(audioType, fileName);
		}
		else
		{
			System.out.println("invalid dear...!!!");
		}
	}
}

//MAIN CLASS.
public class AdapterDesign {
	
	//MAIN METHOD.
	public static void main(String[] args) throws NullPointerException
	{
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Emiway Bantai");
		
		audioPlayer.play("vlc", "horror movie");
		audioPlayer.play("kbj", "jba");
	}
}
