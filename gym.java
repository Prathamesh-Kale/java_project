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
                    case 4:
                   System.out.println("Lests start by selecting Biceps workout");
                    System.out.println("*****************");
                    System.out.println("Biceps WORKOUT TYPE");
                    System.out.println("1--Barbell curl");
                    System.out.println("2---Cable curl");
                    System.out.println("3----Dumbbell Curl");
                    System.out.println("4-----Hammer Curl");
                    System.out.println("5----Preacher Curl");
                    Scanner g=new Scanner(System.in);
                    int select3=g.nextInt();
                    switch(select3)
                    { case 1:
                        System.out.println("Barbell curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h1=new Scanner(System.in);
                        int about1=h1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[3]="Barbell curl";
                            break;
                            case 2:
                                     System.out.println("The standard shoulder-width curl engages the short and long heads of the biceps equally, you can alter grip width to slightly change the emphasis (wide to target the short head, narrow for the long head), you can really pile on the weight, and you don't have to sit there endlessly working one arm at a time.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h1.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Barbell curl";
                                    else
                                    workout_plan(4);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("Cable curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h2=new Scanner(System.in);
                        int about2=h2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[3]="Cable curl";
                            break;
                            case 2: System.out.println("This movement seems a lot like the standing barbell curl at first glance. After all, they're both bilateral movements in which you take a shoulder-width, underhand grip on the bar. What makes it different is that, like all of the best muscle-building cable exercises, the angle of loading gives you constant tension on the muscle through the full range of motion.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h2.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Cable curl";
                                    else
                                    workout_plan(4);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("Dumbbell Curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h3=new Scanner(System.in);
                        int about3=h3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[3]="Dumbbell Curl";
                            break;
                            case 2: System.out.println(" AThe real value of dumbbell curls is that they can be done a number of ways: standing or seated, with both arms or alternating, rotating your wrists into Zottman curls to work on your fearsome forearms, or twisting that pinky up to focus purely on the bis. In short, you have options.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h3.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Dumbbell Curl";
                                    else
                                    workout_plan(4);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("Hammer Curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h4=new Scanner(System.in);
                        int about4=h4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[3]="Hammer Curl";
                            break;
                            case 2: System.out.println("Curls with a palms-facing or neutral grip do more than just hit the biceps, they also heavily recruit the brachialis, a muscle that doesn't get measured on EMG studies because it's beneath the biceps. Because it's not as obvious a move as, say, a barbell curl, it often gets undeservedly skipped on arm day.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h4.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Hammer Curl";
                                    else
                                    workout_plan(4);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("Preacher Curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h5=new Scanner(System.in);
                        int about5=h5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[3]="Preacher Curl";
                            break;
                            case 2: System.out.println("There are many versions of the preacher curl, and every serious physique builder has their fave. Whatever version you do, you'll get a serious pump, particularly if you have a quality pre-workout or pump supplement coursing through your bloodstream at the time. In fact, this old-school peak-builder can be nearly enough for an entire biceps workout, perhaps with something like hammer curls added to it.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h5.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Preacher Curl";
                                    else
                                    workout_plan(4);
                            break;
                        } 
                        break;
                      
                    }
                  }
                    // break;

                    }  
                   
                    // System.out.println(bb_plan[0]); change the return type of fumction to string and return bb_plan
                    // System.out.println(bb_plan[1]);
                    // System.out.println(bb_plan[2]);      
                    
                    
    void calisthenics_workout_plan(int type)//core,calisthenics etc
    { 
      // 
        switch(type)        
        {
            case 1:
                    System.out.println("Thank you for choosing Calisthenics as your type");
                    System.out.println("*****************");
                    System.out.println("Lests start by selecting Back workout");
                    System.out.println("*****************");
                    System.out.println("BACK WORKOUT TYPE");
                    System.out.println("1--Wall Pulls");
                    System.out.println("2---Standard Pull-Up");
                    System.out.println("3-----Close Grip Pull-Ups");
                    System.out.println("4----The L-Pull-Up");
                    System.out.println("5----Assisted 1 Arm Pull-ups");
                    Scanner a=new Scanner(System.in);
                    int select=a.nextInt();
                    switch(select)
                    {
                        case 1:
                        System.out.println("Wall Pulls");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b1=new Scanner(System.in);
                        int about1=b1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[0]="Wall Pulls";
                            break;
                            case 2:System.out.println("Find a doorway or a wall that is only ~8 inches wide where you can easily grasp both sides of it.\r\n" + //
                                "\r\n" + //
                                "Make sure that you can grip it safely. Bring your feet as close to the wall as possible and let your arms fully extend which will shift your body weight backward.\r\n" + //
                                "\r\n" + //
                                "Pull yourself back towards the wall and pinch your scapula together at the top. Slowly return back to the start.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b1.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Wall Pulls";
                                    else
                                    calisthenics_workout_plan(1);
                                    
                                    
                            break;
                                    
                            
                        } 
                        break;
                        case 2:
                        System.out.println("Standard Pull-Up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b2=new Scanner(System.in);
                        int about2=b2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[0]="Standard Pull-Up";
                            break;
                            case 2:System.out.println( "The pull-up is to the upper body, what the squat is to the lower body.\r\n" + //
                                "\r\n" + //
                                "It is a great measure of upper body strength and develops the entire upper back into a shredded map.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b2.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Standard Pull-Up";
                                    else
                                    calisthenics_workout_plan(1);
                                    
                                  
                            break;
                                    
                            
                        } 
                        break;
                        case 3:
                        System.out.println("Close Grip Pull-Ups");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b3=new Scanner(System.in);
                        int about3=b3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[0]="Close Grip Pull-Ups";
                            break;
                            case 2:System.out.println("The closer your hands move, the more work your arms have to do to get yourself above the bar.\r\n" + //
                                "\r\n" + //
                                "Keep bringing your hands closer together until you do pull-ups with your hands touching.");
                                  System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b3.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Close Grip Pull-Ups";
                                    else
                                    calisthenics_workout_plan(1);
                                    
                            break;
                                    
                            
                        } 
                        break;
                        case 4:
                        System.out.println("The L-Pull-Up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b4=new Scanner(System.in);
                        int about4=b4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[0]="The L-Pull-Up";
                            break;
                            case 2:System.out.println("In this exercise, you are simply going to extend your legs out in front of you creating an L shape with your body. You will do pull-ups like you normally would while maintaining the L shape.\r\n" + //
                                "\r\n" + //
                                "This exercise helps stabilize your body and activates your core musculature.");
                                  System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b4.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="The L-Pull-Up";
                                    else
                                    calisthenics_workout_plan(1);
                                    
                            break;
                                    
                            
                        } 
                        break;
                        case 5:
                        System.out.println("Assisted 1 Arm Pull-ups");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner b5=new Scanner(System.in);
                        int about5=b5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[0]="Assisted 1 Arm Pull-ups";
                            break;
                            case 2:System.out.println("Straddle a towel on the bar and grip the towel with one hand and the bar with your other hand. The hand on the bar has to do more work. The lower down you grasp on the towel, the harder the exercise becomes.");
                                  System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=b5.nextInt();
                                    if(ans==1)
                                    bb_plan[0]="Assisted 1 Arm Pull-ups";
                                    else
                                    calisthenics_workout_plan(1);
                                    
                            break;
                                    
                            
                        } 
                        break;

                    }
                  // break;
             case 2:
                   System.out.println("Lests start by selecting Leg workout");
                    System.out.println("*****************");
                    System.out.println("Leg WORKOUT TYPE");
                    System.out.println("1--The half Squat");
                    System.out.println("2---Leg Box Squat");
                    System.out.println("3----Box Jumps");
                    System.out.println("4-----The Split Squat");
                    System.out.println("5----Lateral Lunge");
                    Scanner c=new Scanner(System.in);
                    int select1=c.nextInt();
                    switch(select1)
                    { case 1:
                        System.out.println("The half Squat");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d1=new Scanner(System.in);
                        int about1=d1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[1]="The half Squat";
                            break;
                            case 2:
                                    System.out.println("Not everyone will be able to do a full squat simply due to flexibility. If you can\u2019t, then perform the squat as low as you can comfortably go. Over time, you will gain more range of motion and be able to go lower.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d1.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="The half Squat";
                                    else
                                    calisthenics_workout_plan(2);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("Leg Box Squat");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d2=new Scanner(System.in);
                        int about2=d2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[1]="Leg Box Squat";
                            break;
                            case 2: System.out.println("This exercise requires a sturdy box or a chair. Simple stand ~6 inches in front of it and balance yourself on one leg. From here, begin squatting down in a smooth controlled motion while keeping your other leg straight out in front of you for balance.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d2.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Leg Box Squat";
                                    else
                                    calisthenics_workout_plan(2);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("Box Jumps");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d3=new Scanner(System.in);
                        int about3=d3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[1]="Box Jumps";
                            break;
                            case 2: System.out.println(" While not technically a squat, the box jump is another variation of the explosive squat. Crouch down, forcefully extend at the hips and jump onto a sturdy box in a semi squat position.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d3.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Box Jumps";
                                    else
                                    calisthenics_workout_plan(2);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("The Split Squat");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d4=new Scanner(System.in);
                        int about4=d4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[1]="The Split Squat";
                            break;
                            case 2: System.out.println("Simply stand with your feet as far apart as you comfortably can. Point your toes forward and maintain a tall neutral spine. From here squat straight down slowly, and come right back up slowly.\r\n" + //
                                "\r\n" + //
                                "If you need to, you can hold onto something for support.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d4.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="The Split Squat";
                                    else
                                    calisthenics_workout_plan(2);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("Lateral Lunge");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner d5=new Scanner(System.in);
                        int about5=d5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[1]="Lateral Lunge";
                            break;
                            case 2: System.out.println("In this variation, you lunge towards your side rather than in front/behind you. This exercise trains the adductor muscles more than anything, but another exercise you can add to your arsenal.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=d5.nextInt();
                                    if(ans==1)
                                    bb_plan[1]="Lateral Lunge";
                                    else
                                    calisthenics_workout_plan(2);
                            break;
                        } 
                        break;
                      
                    }
                    //  break;
                    case 3:
                   System.out.println("Lests start by selecting Chest workout");
                    System.out.println("*****************");
                    System.out.println("Chest WORKOUT TYPE");
                    System.out.println("1--Close Grip Push-Up");
                    System.out.println("2---The 1 Handed Push-up");
                    System.out.println("3----The Dynamic Push-Up");
                    System.out.println("4-----Uneven Pushups");
                    System.out.println("5----The Decline Push-Up");
                    Scanner e=new Scanner(System.in);
                    int select2=e.nextInt();
                    switch(select2)
                    { case 1:
                        System.out.println("Close Grip Push-Up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f1=new Scanner(System.in);
                        int about1=f1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[2]="Close Grip Push-Up";
                            break;
                            case 2:
                                    System.out.println("The closer your hands move, the more tricep dominant the lift becomes. This variation changes the leverage of the movement, allowing the arms to do more work.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f1.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Close Grip Push-Up";
                                    else
                                    calisthenics_workout_plan(3);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("The 1 Handed Push-up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f2=new Scanner(System.in);
                        int about2=f2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[2]="The 1 Handed Push-up";
                            break;
                            case 2: System.out.println("The one hand push-up is an exercise that demonstrates a good deal of strength. Only attempt it if you have developed a great foundation of strength in all of the other variations.\r\n" + //
                                "\r\n" + //
                                "Initially, you may only be able to do it with a wide foot stance and a slight bend in the upper body, but as you get stronger, you can bring your feet closer together.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f2.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="The 1 Handed Push-up";
                                    else
                                    calisthenics_workout_plan(3);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("The Dynamic Push-Up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f3=new Scanner(System.in);
                        int about3=f3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[2]="The Dynamic Push-Up";
                            break;
                            case 2: System.out.println(" In the dynamic push-up, you simply explode up and propel your hands off the floor in between reps.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f3.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="The Dynamic Push-Up";
                                    else
                                    calisthenics_workout_plan(3);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("Uneven Pushups");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f4=new Scanner(System.in);
                        int about4=f4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[2]="Uneven Pushups";
                            break;
                            case 2: System.out.println("The uneven push-up begins to train each arm individually.\r\n" + //
                                "\r\n" + //
                                "By placing one hand higher than the other, you isolate the bottom arm to do more work overall. Just make sure to train both sides evenly.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f4.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="Uneven Pushups";
                                    else
                                    calisthenics_workout_plan(3);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("The Decline Push-Up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner f5=new Scanner(System.in);
                        int about5=f5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[2]="The Decline Push-Up";
                            break;
                            case 2: System.out.println("By placing your feet on a bench, you increase the amount of weight your arms have to lift. The decline push-up will train the upper chest a lot more since the angle at which you are pressing becomes more acute.\r\n" + //
                                "\r\n" + //
                                "All of the standard push-up rules apply.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=f5.nextInt();
                                    if(ans==1)
                                    bb_plan[2]="The Decline Push-Up";
                                    else
                                    calisthenics_workout_plan(3);
                            break;
                        } 
                        break;
                      
                    }
                    case 4:
                   System.out.println("Lests start by selecting Biceps and SHoulders workout");
                    System.out.println("*****************");
                    System.out.println("Shoulders WORKOUT TYPE");
                    System.out.println("1--The Pike Push-Up");
                    System.out.println("2---Close Grip Pike Push-up");
                    System.out.println("3----Wall Hand Stands");
                    System.out.println("4-----Handstand Push-ups");
                    System.out.println("5----Chest To Wall Handstand Push-ups");
                    Scanner g=new Scanner(System.in);
                    int select3=g.nextInt();
                    switch(select3)
                    { case 1:
                        System.out.println("The Pike Push-Up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h1=new Scanner(System.in);
                        int about1=h1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[3]="The Pike Push-Up";
                            break;
                            case 2:
                                     System.out.println("The pike pushup is an intermediate exercise between the standard push-up and the handstand push-up.\r\n" + //
                                         "\r\n" + //
                                         "Bend down and put your hands on the floor at shoulder width. From here, get onto your tippy-toes and try to create a V shape by bringing your hands and feet as close together as possible.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h1.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="The Pike Push-Up";
                                    else
                                    calisthenics_workout_plan(4);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("Close Grip Pike Push-up");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h2=new Scanner(System.in);
                        int about2=h2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[3]="Close Grip Pike Push-up";
                            break;
                            case 2: System.out.println("Just like the push-up, the pike push-up becomes much harder as your hands move closer together. Keep bringing your hands closer together until you do them with your hands touching.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h2.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Close Grip Pike Push-up";
                                    else
                                    calisthenics_workout_plan(4);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("Wall Hand Stands");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h3=new Scanner(System.in);
                        int about3=h3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[3]="Wall Hand Stands";
                            break;
                            case 2: System.out.println(" Face a wall and stand ~6 inches away from it. Kneel down on your hands and knees and bend one knee up towards your head while the other is extended straight behind you.\r\n" + //
                                "\r\n" + //
                                "Secure your hands on the floor at approximately shoulder width, with your arms extended and locked.\r\n" + //
                                "\r\n" + //
                                "From here, kick off hard with the bent knee, which should help you propel both legs up into the air and towards the wall. Gently find the wall with the heels of your feet and extend your entire body.\r\n" + //
                                "\r\n" + //
                                "Keep everything tight and locked.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h3.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Wall Hand Stands";
                                    else
                                    calisthenics_workout_plan(4);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("Handstand Push-ups");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h4=new Scanner(System.in);
                        int about4=h4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[3]="Handstand Push-ups";
                            break;
                            case 2: System.out.println("Once you are comfortable in a handstand, feel free to begin bending at the elbows and performing handstand pushups until your head is touching the floor on every rep.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h4.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Handstand Push-ups";
                                    else
                                    calisthenics_workout_plan(4);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("Chest To Wall Handstand Push-ups");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h5=new Scanner(System.in);
                        int about5=h5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[3]="Chest To Wall Handstand Push-ups";
                            break;
                            case 2: System.out.println("This is the most difficult variation of all. You will do handstand push ups but with your chest facing the wall. Bring your hands closer than shoulder width to increase the demand on your arms.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h5.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Chest To Wall Handstand Push-ups";
                                    else
                                    calisthenics_workout_plan(4);
                            break;
                        } 
                        break;
                      
                    }
                    // break;

                    }  
                    
                    
        }
    void yoga_workout_plan(int type)//core,calisthenics etc
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
                                    yoga_workout_plan(1);
                                    
                                    
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
                                    yoga_workout_plan(1);
                                    
                                  
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
                                    yoga_workout_plan(1);
                                    
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
                                    yoga_workout_plan(1);
                                    
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
                                    yoga_workout_plan(1);
                                    
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
                                    yoga_workout_plan(2);
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
                                    yoga_workout_plan(2);
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
                                    yoga_workout_plan(2);
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
                                    yoga_workout_plan(2);
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
                                    yoga_workout_plan(2);
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
                                    yoga_workout_plan(3);
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
                                    yoga_workout_plan(3);
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
                                    yoga_workout_plan(3);
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
                                    yoga_workout_plan(3);
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
                                    yoga_workout_plan(3);
                            break;
                        } 
                        break;
                      
                    }
                    case 4:
                   System.out.println("Lests start by selecting Biceps workout");
                    System.out.println("*****************");
                    System.out.println("Biceps WORKOUT TYPE");
                    System.out.println("1--Barbell curl");
                    System.out.println("2---Cable curl");
                    System.out.println("3----Dumbbell Curl");
                    System.out.println("4-----Hammer Curl");
                    System.out.println("5----Preacher Curl");
                    Scanner g=new Scanner(System.in);
                    int select3=g.nextInt();
                    switch(select3)
                    { case 1:
                        System.out.println("Barbell curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h1=new Scanner(System.in);
                        int about1=h1.nextInt();
                        switch(about1)
                        {
                            case 1:bb_plan[3]="Barbell curl";
                            break;
                            case 2:
                                     System.out.println("The standard shoulder-width curl engages the short and long heads of the biceps equally, you can alter grip width to slightly change the emphasis (wide to target the short head, narrow for the long head), you can really pile on the weight, and you don't have to sit there endlessly working one arm at a time.");
                                   System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h1.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Barbell curl";
                                    else
                                    yoga_workout_plan(4);
                            break;
                       } 
                        break;
                        case 2:
                        System.out.println("Cable curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h2=new Scanner(System.in);
                        int about2=h2.nextInt();
                        switch(about2)
                        {
                            case 1:bb_plan[3]="Cable curl";
                            break;
                            case 2: System.out.println("This movement seems a lot like the standing barbell curl at first glance. After all, they're both bilateral movements in which you take a shoulder-width, underhand grip on the bar. What makes it different is that, like all of the best muscle-building cable exercises, the angle of loading gives you constant tension on the muscle through the full range of motion.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h2.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Cable curl";
                                    else
                                    yoga_workout_plan(4);
                            break;
                        } 
                        break;
                      
                        case 3:
                        System.out.println("Dumbbell Curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h3=new Scanner(System.in);
                        int about3=h3.nextInt();
                        switch(about3)
                        {
                            case 1:bb_plan[3]="Dumbbell Curl";
                            break;
                            case 2: System.out.println(" AThe real value of dumbbell curls is that they can be done a number of ways: standing or seated, with both arms or alternating, rotating your wrists into Zottman curls to work on your fearsome forearms, or twisting that pinky up to focus purely on the bis. In short, you have options.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h3.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Dumbbell Curl";
                                    else
                                    yoga_workout_plan(4);
                            break;
                        } 
                        break;
                      case 4:
                        System.out.println("Hammer Curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h4=new Scanner(System.in);
                        int about4=h4.nextInt();
                        switch(about4)
                        {
                            case 1:bb_plan[3]="Hammer Curl";
                            break;
                            case 2: System.out.println("Curls with a palms-facing or neutral grip do more than just hit the biceps, they also heavily recruit the brachialis, a muscle that doesn't get measured on EMG studies because it's beneath the biceps. Because it's not as obvious a move as, say, a barbell curl, it often gets undeservedly skipped on arm day.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h4.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Hammer Curl";
                                    else
                                    yoga_workout_plan(4);
                            break;
                        } 
                        break;
                      case 5:
                        System.out.println("Preacher Curl");
                        System.out.println("1---Add to Workout");
                        System.out.println("2---About exercise");
                        Scanner h5=new Scanner(System.in);
                        int about5=h5.nextInt();
                        switch(about5)
                        {
                            case 1:bb_plan[3]="Preacher Curl";
                            break;
                            case 2: System.out.println("There are many versions of the preacher curl, and every serious physique builder has their fave. Whatever version you do, you'll get a serious pump, particularly if you have a quality pre-workout or pump supplement coursing through your bloodstream at the time. In fact, this old-school peak-builder can be nearly enough for an entire biceps workout, perhaps with something like hammer curls added to it.");
                                    System.out.println("Shall we add this exercise to your workout?");
                                    System.out.println("Enter 1 for yes 0 for no");
                                    int ans=h5.nextInt();
                                    if(ans==1)
                                    bb_plan[3]="Preacher Curl";
                                    else
                                    yoga_workout_plan(4);
                            break;
                        } 
                        break;
                      
                    }
                  }
                    // break;

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
        if(exercise_type==1)
        user1.workout_plan(exercise_type);
        else if(exercise_type==2)
        user1.calisthenics_workout_plan(1);
        else
        user1.yoga_workout_plan(1);
       
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


