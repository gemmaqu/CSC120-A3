Use this file to record your reflection on this assignment.

- Which classmates did you consult with while working on this assignment?
- Which session(s) of TA / office hours did you attend?
- What are your initial impressions of Java? 
- Can you draw any conclusion about programming in general from the similarities or the differences between the two languages? 
- What worked, what didn't, what advice would you give someone taking this course in the future?

!!!Resubmission reflection!!!
By looking at the rubric on gradescope, I fixed all the problems that I didn't get point.
1. Re-creates array of canned responses in individual / local variables inside conversation loop:
        I fixed this by defining the random response array as a class attribute.Then in my respond() method, I just use those existing objects.
2. Detects some mirror words correctly
        I fixed that by checking all the mirror word. And I found if I enter"My" rather than "my", the mirror words don't work. So I fixed that.
3. Replaces some mirror words, but misses others (e.g. the first detected mirror word in a sentence, but misses subsequent mirror words) or adds extra replacements (e.g. I feel -> you are)
        I fixed this by checking all the required mirror words in README file, and add what I ignored before.
4. Complex mirror replacements unsupported
        I fixed this by adding mirror words such as "I feel"-> "You are"

5. Stored transcript incomplete / incorrect
        I fixed this by storing the random responses in a variable and using it for both printing and adding to the transcript.
6. Array declaration brackets in wrong position
        I fixed this by changing the position of brackets, which is in line 75.

I consulted with Joyce Liang who is on 02section, and I asked Kira Hu who takes the class last semester.
TA: Mon 7-9p.m. at 241, with Zihan Lyu. Thanks a lot to Zihan, she helps me sturcture my code and think together with me what method I should use to write each function. Also, she helped me debug the code, which makes it run successfully evntually.
More complicated than python, and a lot of concepts to understand, like attributes, constructor. And they're easy to forget if you don't code for a long time. However, the logic of writing is similar to python.
Similarities: logic. Difference: syntax
Start early!!! I know I said this on my last reflection...But I still started my work late late this week. I will definitely start early for my next homework. Also, I found using Chatgpt to learn the syntax of Java is pretty useful, because the format it present to you is easier to read than google page and it will also provide you with example.

!!!!Problem: I don't know why my vscode cann't run the code at first, and it shows a lot of red underlines, which i'm not sure if it's because of syntax error or others. I tried to download JDK package, and also follow the guidance on video to enable java test, but those all didn't work. So i have to debug on Zihan's laptop and it worked. I don't know why it becomes that.


