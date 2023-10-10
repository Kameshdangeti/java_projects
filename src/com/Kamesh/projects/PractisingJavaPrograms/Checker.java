package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Comparator;

	class Checker implements Comparator<Player>
	{
	    public int compare(Player p1, Player p2)
	    {
	        return p2.score==p1.score? p1.name.compareTo(p2.name):p2.score-p1.score;
	    }
	}
