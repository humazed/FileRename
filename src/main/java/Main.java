import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File folder = new File("C:\\Users\\huma\\Desktop\\tmp\\Mosa\\ConTrol.doglas");

        String[] oldNames = {"Why Learn Control Theory",
                "Control Systems Lectures - Closed Loop Control",
                "Control Systems Lectures - Time and Frequency Domain",
                "Control Systems Lectures - LTI Systems",
                "Control Systems Lectures - Transfer Functions",
                "Introduction to the Fourier Transform (Part 1)",
                "Introduction to the Fourier Transform (Part 2)",
                "The Laplace Transform - A Graphical Approach",
                "Control System Lectures - Bode Plots, Introduction",
                "Bode Plots by Hand_ Real Constants",
                "Bode Plots by Hand_ Poles and Zeros at the Origin",
                "Bode Plots by Hand_ Real Poles or Zeros",
                "Bode Plots by Hand_ Complex Poles or Zeros",
                "CORRECTION_ Bode Plots by Hand_ Complex Poles or Zeros",
                "Final Value Theorem and Steady State Error",
                "Introduction to System Stability and Control",
                "Stability of Closed Loop Control Systems",
                "Routh-Hurwitz Criterion, An Introduction",
                "Routh-Hurwitz Criterion, Special Cases",
                "Routh-Hurwitz Criterion, Beyond Stability",
                "The Root Locus Method - Introduction",
                "Sketching Root Locus Part 1",
                "Sketching Root Locus Part 2",
                "Root Locus Plot_ Common Questions and Answers",
                "Gain a better understanding of Root Locus Plots using Matlab",
                "Nyquist Stability Criterion, Part 1",
                "Nyquist Stability Criterion, Part 2",
                "PID Control - A brief introduction",
                "Simple Examples of PID Control",
                "Standard HW Problem #1_ PID and Root Locus",
                "Gain and Phase Margins Explained!",
                "Understanding The Sensitivity Function",
                "What are Lead Lag Compensators? An Introduction.",
                "Designing a Lead Compensator with Root Locus",
                "Designing a Lead Compensator with Bode Plot",
                "Designing a Lag Compensator with Root Locus",
                "Designing a Lag Compensator with Bode Plot",
                "Modeling Physical Systems, An Overview",
                "System Identification Methods",
                "Robotic Car, Closed Loop Control Example",
                "Robotic Car - A Simple Way to Build a Model",
                "Robotic Car - How to read Gyro Datasheets (Part 1)",
                "Robotic Car - How to read Gyro Datasheets (Part 2)",
                "A simple MEMS gyro model using MATLAB / Simulink",
                "Controlling Robotic Swarms",
                "How to Land on a Planet (and how it'll be done in the future!)"};

        File[] files = folder.listFiles();

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                System.out.println("old name: #" + i + " " + files[i].getName());

                File oldFiles = new File(folder, oldNames[i] + ".mp4");
                File newFile = new File(oldFiles.getParent(), (i + 1) + "- " + oldNames[i] + ".mp4");
                try {
                    Files.move(oldFiles, newFile);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }

    }
}
