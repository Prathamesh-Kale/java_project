import java.util.Scanner;

  
   
 


    
  class plan
  {
      String bb_plan[] =new String[10];
  }


class user extends plan

 {   
  

  static
    {   System.out.println("*************************");
        System.out.println("Welcome to Fit and Lean Gym");
        System.out.println("This is your first step on your fitness journey");
        System.out.println("*************************");
        System.out.println("We are a fitness focused gym interested in giving tangible results");
        System.out.println("First lest start by registering you to our portal");
        System.out.println("We hope you will enjoy your fitness journey");
        System.out.println("***********************");

    }
    
     
    String checkWeight(double bmi)
    {   String type="";
        if(bmi<18.5)
           type="Underweight";
            if(bmi>18.5 && bmi<=25.0)
            type="Healthy";
            if(bmi>25 && bmi<=30)
            type="Overweight";
            else
            type="Obesity";
            return type;

    }

    double bmi(double weight,double height)
    {
        return (weight)/(0.01*0.01*height*height);
    }
    void workout_plan(int type)//core,calisthenics etc
    { 
      // 
        switch(type)        
        {
            case 1:
                    System.out.println("Thank you for choosing Bodybuild as your type");
                    System.out.println("*****************");
                    System.out.println("Lests start by selecting Back workout");
                    System.out.println("*****************");
                    System.out.println("BACK WORKOUT TYPE");
                    System.out.println("1--Wide grip pull-down");
                    System.out.println("2---Bent-over row");
                    System.out.println("3-----Deadlift");
                    System.out.println("4----Pull up");
                    System.out.println("5----Lat pull down");
                    Scanner a=new Scanner(System.in);
                    int select=a.nextInt();
                    switch(select)
                    {
                        case 1:
                        System.out.println("Wide Grip Pull Down");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b1=new Scanner(System.in);
                        int about1=b1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[0]="Wide Grip Pull Down";
                            break;
                            case 2:System.out.println("Grip the bar with shoulder-width palms facing away and your arms fully extended above your head. Do not lean back as you pull the bar to the top of your chest and hold it there for two seconds. Control the bar as it pulls itself back to the start position, aiming for a three second ascent with no pause at the top of the movement.\r\n" + //
                                    "\r\n" + //
                                    "");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b1.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Wide Grip Pull Down";
                                    else
                                    workout_plan(1);
                                    
                                    
                            break;
                                    
                            
                        } 
                        break;
                        case 2:
                        System.out.println("Bent Over Row");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b2=new Scanner(System.in);
                        int about2=b2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[0]="Bent Over Row";
                            break;
                            case 2:System.out.println( "Grab a barbell with an overhand grip, hands slightly wider than shoulder width apart. With your legs slightly bent, keep your back perfectly straight and bend your upper body until it\u2019s almost perpendicular to the floor. From here, row the weight upwards into the lower part of your chest. Pause. And return under control to the start position.\r\n" + //
                                    "\r\n" + //
                                    "");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b2.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Bent Over Row";
                                    else
                                    workout_plan(1);
                                    
                                  
                            break;
                                    
                            
                        } 
                        break;
                        case 3:
                        System.out.println("Dead Lift");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b3=new Scanner(System.in);
                        int about3=b3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[0]="Deadlift";
                            break;
                            case 2:System.out.println("Squat down and grasp a barbell with your hands roughly shoulder-width apart. Keep your chest up, pull your shoulders back and look straight ahead as you lift the bar. Focus on taking the weight back onto your heels and keep the bar as close as possible to your body at all times. Lift to thigh level, pause, then return under control to the start position.");
                                  System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b3.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Deadlift";
                                    else
                                    workout_plan(1);
                                    
                            break;
                                    
                            
                        } 
                        break;
                        case 4:
                        System.out.println("Pull up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b4=new Scanner(System.in);
                        int about4=b4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[0]="Pull up";
                            break;
                            case 2:System.out.println("It's always a good idea to have an overhead pulling movement in your back routine, and the pull-up is one of the best. Each variation has its own advantages: Wide-grip variations are great for the upper lats, while close-grip chins or neutral-grip pull-ups have a greater stretch and overall range of motion. Mix it up!");
                                  System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b4.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Pull up";
                                    else
                                    workout_plan(1);
                                    
                            break;
                                    
                            
                        } 
                        break;
                        case 5:
                        System.out.println("Lat pull Down");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b5=new Scanner(System.in);
                        int about5=b5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[0]="Lat pull Down";
                            break;
                            case 2:System.out.println("Your first impulse may be to reach for the wide-grip bar, but back-focused EMG research suggests that use of a close neutral grip activates the lats similarly to a regular grip. This grip also allows for a longer range of motion and increased time under tension for the lats, which is great for building muscle.\r\n" + //
                                "\r\n" + //
                                "Slow down the rep tempo on these, squeeze hard at the bottom of each rep, and allow a good stretch at the top.");
                                  System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b5.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Lat pull Down";
                                    else
                                    workout_plan(1);
                                    
                            break;
                                    
                            
                        } 
                        break;

                    }
                  // break;
             case 2:
                   System.out.println("Lests start by selecting Leg workout");
                    System.out.println("*****************");
                    System.out.println("Leg WORKOUT TYPE");
                    System.out.println("1--Deadlift");
                    System.out.println("2---Lunge");
                    System.out.println("3----Leg Press");
                    System.out.println("4-----hack squat");
                    System.out.println("5----Leg curl");
                    Scanner c=new Scanner(System.in);
                    int select1=c.nextInt();
                    switch(select1)
                    { case 1:
                        System.out.println("Deadlift");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d1=new Scanner(System.in);
                        int about1=d1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[1]="Deadlift";
                            break;
                            case 2:
                                    System.out.println("Deadlift variations are rightfully considered whole-body exercises, specifically for the posterior chain. But research has shown that along with the hamstrings and glutes, they definitely hit the quads, as well\u2014especially if you pull with a wider or sumo-style stance.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d1.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Deadlift";
                                    else
                                    workout_plan(2);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("Lunge");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d2=new Scanner(System.in);
                        int about2=d2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[1]="Lunge";
                            break;
                            case 2: System.out.println("Like all the movements listed thus far, lunges involve hip and knee extension, which gives you the stimulus for both the thighs and glutes. Another advantage: They can be done weighted in traditional muscle-building rep ranges, with dumbbells or a barbell, or with body weight alone for higher reps.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d2.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Lunge";
                                    else
                                    workout_plan(2);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("Leg Press");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d3=new Scanner(System.in);
                        int about3=d3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[1]="Leg Press";
                            break;
                            case 2: System.out.println(" Like hack squats, the leg press allows for a variety of foot positions to target the outer quads, inner quads, glutes, or hamstrings. Just be careful not to lower the sled too far! This common mistake will lift your glutes up off the butt pad and cause your lower spine to curl. A rounded back puts you at risk for an injury.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d3.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Leg Press";
                                    else
                                    workout_plan(2);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("hack squat");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d4=new Scanner(System.in);
                        int about4=d4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[1]="hack squat";
                            break;
                            case 2: System.out.println("One of the primary benefits of the hack squat is that you can manipulate foot placement, which is why fitness model Julian \"The Quad Guy\" Smith considers them one of his signature moves for legs. A high placement allows you to descend farther, which emphasizes the glutes and hamstrings. A lower placement means the quads take up a greater percentage of the workload.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d4.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="hack squat";
                                    else
                                    workout_plan(2);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("Leg curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d5=new Scanner(System.in);
                        int about5=d5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[1]="Leg curl";
                            break;
                            case 2: System.out.println("Keep it simple: 3-4 sets of 8-12 reps, coming close to muscle failure. This is a low-risk, high-reward move, so occasionally add in some slow negatives or dropsets to make it more intense.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d5.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Leg curl";
                                    else
                                    workout_plan(2);
                            break;
                        } 
                        break;
                      
                    }
                    //  break;
                    case 3:
                   System.out.println("Lests start by selecting Chest workout");
                    System.out.println("*****************");
                    System.out.println("Chest WORKOUT TYPE");
                    System.out.println("1--Barbell Bench Press");
                    System.out.println("2---Incline Bench Press");
                    System.out.println("3----Decline Press");
                    System.out.println("4-----Machine Chest Press");
                    System.out.println("5----Machine Fly");
                    Scanner e=new Scanner(System.in);
                    int select2=e.nextInt();
                    switch(select2)
                    { case 1:
                        System.out.println("Barbell Bench Press");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f1=new Scanner(System.in);
                        int about1=f1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[2]="Barbell Bench Press";
                            break;
                            case 2:
                                    System.out.println("the standard barbell bench allows you to move the most weight. It's also an easier lift to control than pressing with heavy dumbbells. The exercise is also relatively easy to spot\u2014so don't be afraid to ask for one!\r\n" + //
                                        "\r\n" + //
                                        "The bench press also responds well to classic protocols like 5x5 for muscle and strength, or even 10x10, aka German Volume Training, for pure mass.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f1.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Barbell Bench Press";
                                    else
                                    workout_plan(3);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("Incline Bench Press");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f2=new Scanner(System.in);
                        int about2=f2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[2]="Incline Bench Press";
                            break;
                            case 2: System.out.println("Not only is the incline bench press a classic way to build the upper chest, many lifters find them to be a more comfortable \"main lift\" for the shoulders than flat benching. It's great with a barbell or multi-grip bar, but maybe be even better with dumbbells, since you can customize your grip to increase focus on the upper pecs.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f2.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Incline Bench Press";
                                    else
                                    workout_plan(3);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("Decline Press");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f3=new Scanner(System.in);
                        int about3=f3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[2]="Decline Press";
                            break;
                            case 2: System.out.println(" Along with the traditional double-arm press, you can sit sideways and press across your body one arm at a time. This unilateral chest move emphasizes shoulder adduction, one of the primary actions of the pec major.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f3.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Decline Press";
                                    else
                                    workout_plan(3);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("Machine Chest Press");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f4=new Scanner(System.in);
                        int about4=f4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[2]="Machine Chest Press";
                            break;
                            case 2: System.out.println("Free-weight pressing moves on a flat bench are great, but machine press and cable press variations have some unique benefits. For one, it's easier to slow down the repetition, both in the concentric and eccentric phases. Stack-loaded machines are also great for quickly doing dropsets.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f4.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Machine Chest Press";
                                    else
                                    workout_plan(3);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("Machine Fly");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f5=new Scanner(System.in);
                        int about5=f5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[2]="Machine Fly";
                            break;
                            case 2: System.out.println("As a pre-exhaust, hit a few sets of 10-15 before your presses.As a burnout, hit the machine fly last in your routine for sets of around 10-12. Experiment with dropsets, partial reps, and other intensity boosters. Don't be afraid to take this movement to failure, and know that you've earned your post-workout protein shake.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f5.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Machine Fly";
                                    else
                                    workout_plan(3);
                            break;
                        } 
                        break;
                      
                    }
                    // break;

                    }  
                   
                    // System.out.println(bb_plan[0]); change the return type of fumction to string and return bb_plan
                    // System.out.println(bb_plan[1]);
                    // System.out.println(bb_plan[2]);            
                    
                    
        }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=s.nextLine();
        System.out.println("********************************");
        System.out.println("Please enter your age");
        int age=s.nextInt();
        System.out.println("********************************");
        System.out.println(" Please enter your gender");
        System.out.println("code|Value");
        System.out.println("1|Male");
        System.out.println("2|Female");
        int gender=s.nextInt();
          System.out.println("********************************");
        System.out.println("Enter your weight on kg");
        double weight=s.nextInt();
          System.out.println("********************************");
        System.out.println("Please enter your height in cm");
        double height=s.nextDouble();
          System.out.println("********************************");
        System.out.println("Please enter your lifestyle type");
        System.out.println("Code|Type");
        System.out.println("1--Active Lifestyle");
        System.out.println("2---Passive Lifestyle");
          System.out.println("********************************");
        System.out.println("Do you want to do weight loss or weight gain");
        System.out.println("code|value");
        System.out.println("1|weight loss");
        System.out.println("2|weight gain");
        int type=s.nextInt();
          System.out.println("********************************");
        System.out.println("Choose your exercise type");
        System.out.println("code|value");
        System.out.println("1|bodybuilding");
        System.out.println("2|Calisthenics");
        System.out.println("3|Core-Exercise");
        System.out.println("4|Yoga");
        System.out.println("5|mix of any 2");
        System.out.println("6|Mix of any 3");
        System.out.println("7|Mix of all");
        int exercise_type=s.nextInt();
          System.out.println("********************************");
        System.out.println("How much time do you want to workout");
        System.out.println("code|Time");
        System.out.println("1|30 Minutes");
        System.out.println("2|45 minutes");
        System.out.println("3|60 minutes");
        System.out.println("4|90 minutes");
        int exercise_time=s.nextInt();
          System.out.println("********************************");
        System.out.println("Enter type of food you eat");
        System.out.println("code|value");
        System.out.println("1|veg");
        System.out.println("2|non-veg");
        System.out.println("3|egg+veg");
        System.out.println("4|vegan");
        int food=s.nextInt();
          System.out.println("********************************");
        System.out.println("Please select Batch Time");
        System.out.println("code|value");
        System.out.println("1|Morning");
        System.out.println("2|Afternoon");
        System.out.println("3|evening");
        int timing=s.nextInt();
        System.out.println("********************************");
        System.out.println("Please enter type of workout");
        System.out.println("code|value");
        System.out.println("1|light");
        System.out.println("2|moderate");
        System.out.println("3|heavy");
        int workut_intensity=s.nextInt();
          System.out.println("********************************");
        System.out.println("Do you have any previous injuries");
        System.out.println("code|value");
        System.out.println("1|arm");
        System.out.println("2|leg");
        System.out.println("3|back");
        System.out.println("4|knee");
        System.out.println("5|eyes");
        System.out.println("6|neck");
        System.out.println("7|none");
        int injury=s.nextInt();
          System.out.println("********************************");
        System.out.println("Have you recently gone through any major operation");
        System.out.println("code|value");
        System.out.println("1|Yes");
        System.out.println("2|no");
          System.out.println("********************************");
        System.out.println("Thank you for your response");
        System.out.println("We are generating a Tailor-Made Workout plan for you");
        System.out.println("********************************");
        user user1=new user();
        user1.workout_plan(exercise_type);
        
        String weightType=user1.checkWeight(user1.bmi(weight, height));
        System.out.println(weightType);
        if(weightType=="Underweight")
        {
            double weightGain=(18-user1.bmi(weight, height))*(height*height*0.01*0.01);
            System.out.println("You are underweight");
            System.out.println("YOu need to gain "+weightGain+"Kg");
        }
        if(weightType=="Overweight" || weightType=="Obesity")
        {
            double weightLoss=((user1.bmi(weight, height))-25)*(height*height*0.01*0.01);
            System.out.println("You are Overweight");
            System.out.println("YOu need to loose "+weightLoss+"Kg");
        }
        if(age<16)
        {
            System.out.println("Sorry you are to Young to come to gym");
        }
        if(age>=16 && age<=40)
        {
            System.out.println("Just like your job fitness is also required");
        }
        if(age>40 && age<60)
        {
            System.out.println("Keep it up your fitness is also important");
        }
        if(age>=60)
        {
            System.out.println("Very good old man Lets get you started with your workour routine");
        }
 
    
    }
}


