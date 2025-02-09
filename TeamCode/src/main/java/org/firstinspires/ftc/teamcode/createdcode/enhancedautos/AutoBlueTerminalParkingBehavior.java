package org.firstinspires.ftc.teamcode.createdcode.enhancedautos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class AutoBlueTerminalParkingBehavior extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        API api = new API(this);
        MovementAPI movementAPI = new MovementAPI(api);

        waitForStart();

        movementAPI.move(-90, 0.7);
        api.pause(0.7);
        movementAPI.stop();
    }
}
