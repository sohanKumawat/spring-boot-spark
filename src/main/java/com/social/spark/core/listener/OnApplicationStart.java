package com.social.spark.core.listener;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.social.spark.core.Count;
import com.social.spark.core.WordCount;

@Component
public class OnApplicationStart {
	 @Autowired
	    WordCount wordCount;
   	 public static int counter;
	    @EventListener
	    public void onApplicationEvent(ContextRefreshedEvent event) {
	        counter++;
	      List<Count> countlst=  wordCount.count();
	      countlst.forEach(count ->{
	    	  System.out.println(" "+count.getWord() +" -- "+count.getCount());
	      });
	      
	    }
}
