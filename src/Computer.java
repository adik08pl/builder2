import lombok.Builder;

@Builder
public class Computer {
    private String processor;
    private int ram;
    private String graphicsCard;
    private String hardDrive;
    private String cooling;
}
