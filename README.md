# Festival Statistics  
  
Every Festival has a gate, where people have to show their tickets.  
  
Write an application where every person is represented by a special Thread that is instantiated with random ticket data. Possible ticket types: full, full-vip, free-pass, one-day, one-day-vip    
Meanwhile, every 5 seconds a FestivalStatisticsThread wakes up and reads the new data from the gate and generates statistics:   
  
e.g   
  
100 people entered  
  
57 people have full tickets  
  
30 have free passes  
  
3 have full VIP passes  
  
10 have one-day passes  
  
0 have one-day VIP passes  