package pack00gof.pack00behavioral.example00command;

// Concrete command for adjusting the volume of a stereo
public class AdjustVolumeCommand implements Command {
  private Stereo stereo;

  public AdjustVolumeCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.adjustVolume();
  }
}
