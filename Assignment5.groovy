package com.test.demo

class Assignment5 {
	
		
		public void main(String[] args)
		{
			
			List l = ["Thirumugam":23,"Mangailakshmi":15,"Harini":25,"Harish":19]
			def l2 = l.collect { new course(name:it,days:it) }
			println(l2)
	
			def sorted = l2.sort { a, b -> a.value.toLowerCase() <=> b.value.toLowerCase() }
			println sorted
			for(int i in l2)
			{
				for(int j in l2)
				{
				  if(i.value==j.value)
					  def name_sorted=l2.sort { a,b -> a.key.toLowerCase() <=> b.key.toLowerCase() }
					  
					  
				}
				  
			}
			
			println l2
			
			
		
		}
		
	}
	
	class course{
		String name
		int days
		public course(String name,int days)
		{
			this.name=name
			this.days=days
		}
	}
