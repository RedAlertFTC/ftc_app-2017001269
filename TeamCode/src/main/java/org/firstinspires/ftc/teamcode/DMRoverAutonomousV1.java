package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "DMRoverAutonomousV1")
public class DMRoverAutonomousV1 extends DMRoverAbstract {

    //Declare variables used for encoders later in the program
    float targetDrDistInch;
    double targetPower;
    float ENCODER_CNT_PER_IN_DRIVE = (float) (3.5*3.15159/288);
    //Set encoder counts per inch to the wheel circumference divided by the number of counts per motor rotation
    double targetPosLeft;
    double targetPosRight;


    /*
    We used the cmdMoveR method to calculate a new target (in encoder
    counts) and to begin the move to the target location.
    The cmdMoveR method uses the parameters (distance inches, encoder count per inch, power, motor)
    to calculate the number of encoder counts to turn the motor. The following lines of code are how we
    implemented the cmdMoveR method:

    targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
    targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);
    */


    @Override
    public void runOpMode() {

        // Lowering the robot on to the playing field
        liftArm.setPower(1);
        sleep(1000);
        liftArm.setPower(0);



        // Detach the hook on the landing arm from the lander
        targetDrDistInch = 2;
        targetPower = .4;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetDrDistInch = -2;
        targetPower = .4;
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        targetDrDistInch = 2;
        targetPower = .5;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        targetDrDistInch = -2;
        targetPower = .4;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetDrDistInch = 2;
        targetPower = .4;
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);



        // Driving forward to the minerals and lowering MCS arm to sample the gold mineral
        targetDrDistInch = 2;
        targetPower = .5;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        //lower MCS arm

        targetDrDistInch = 2;
        targetPower = .5;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        //raise MCS arm




        //back up and drive to the depot
        targetDrDistInch = -2;
        targetPower = .5;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        targetDrDistInch = -6;
        targetPower = .4;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetDrDistInch = 6;
        targetPower = .4;
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        targetDrDistInch = 48;
        targetPower = .5;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        targetDrDistInch = -4;
        targetPower = .4;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetDrDistInch = 4;
        targetPower = .4;
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);

        targetDrDistInch = 42;
        targetPower = .5;
        targetPosLeft = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, leftDrive);
        targetPosRight = cmdMoveR(targetDrDistInch, ENCODER_CNT_PER_IN_DRIVE, targetPower, rightDrive);



        // Deposit marker





        // Drive to Crater to Park
        
    }
}