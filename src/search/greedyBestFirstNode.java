/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.*;

/**
 *
 * @author steven
 */
public class greedyBestFirstNode extends Node implements Comparable<greedyBestFirstNode>{

    public greedyBestFirstNode(State st, Node previousNode, Action lastAction) {
        super(st,previousNode,lastAction);
    }

    public int compareTo(greedyBestFirstNode n){
        int score = st.getEstimatedDistanceToGoal();
        int scoreN = n.st.getEstimatedDistanceToGoal();
        return score - scoreN;
    }

}
