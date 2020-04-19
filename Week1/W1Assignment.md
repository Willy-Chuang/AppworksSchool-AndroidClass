Q1 .
	a: val id = 9527
		Ans: Correct


	b: var number : Int = 5.6
		Ans: Incorrect
			Int stands for integer, for instance, 5.6 isn’t an integer

	
	c: var title = “Hello Kotlin!”
		Ans: Correct


	d: val content : String = null
		Ans: Incorrect
			Kotlin is a null safe language, by default, types can’t be null, however if we add “?” to the type, then the variable can be nullable. (val content : String? = null)


	e: val number : Double? =556.6
		Ans: Correct


	f: var list : List<String>? = listOf(null, null)
		Ans: Incorrect
			String could not be null, so it should be List<String?>, the question mark was misplaced, which meant to make the List nullable but not the parameter.

	g: var list: List<String?>? = listOf(“Wayne”, “Chen”)
		Ans: Correct


	h: list.size
		Ans: Correct


	i: list?.size
		Ans: Incorrect
			A list is never null, the variables within might be null, but the list itself is not null. Not to mention, we are talking about size here. 

Q2.
	Ans: C “Your grace.”

	Why: the message length is 39 in total, according to the when expression, different strings will 	be returned, due to the difference between the length of message, in that case, “Your grace.” will be the answer1..39 -> println(“Your grace.”) .


Q3.
	Ans: D “val array = Array(6) {1000.0pow(it)}”

	Why: Since it’s an array of 6 and the result is 1000^0, 1000^1, 1000^2…etc, so the equation should goes like this 1000^x x= 0~5
	
