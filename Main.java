//                                                 17th Question

package com.vijay;

import java.util.*;

class sortStack
{

    public static Stack<Integer> sortstack(Stack<Integer> input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            int tmp = input.pop();


            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp)
            {

                input.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String[] args)
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(55);
        input.add(41);
        input.add(26);
        input.add(89);
        input.add(75);
        input.add(32);


        Stack<Integer> tmpStack=sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
}