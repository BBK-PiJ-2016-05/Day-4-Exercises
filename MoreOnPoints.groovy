class Point {

	double x
	double y
	
	//calculates the distance to another point
	double distanceTo(Point anotherPoint){
		double distance = ((this.x - anotherPoint.x) ** 2 + (this.y - anotherPoint.y) ** 2) ** 0.5
		return distance
	}

	//calculates the distance to the origin
	double distanceToOrigin(){
		Point origin = new Point()
		origin.x = 0
		origin.y = 0
		return distanceTo(origin)
	}

	//changes the coordinates of this point to be the given parameters x and y
	void moveTo(double x, double y){
		this.x = x
		this.y = y
	}

	//changes the coordinates of this point to move where the given point is
	void moveTo(Point givenPoint){
		moveTo(givenPoint.x, givenPoint.y)
	}

	//returns a copy of the current point with the same coordinates
	Point clone(){
		Point clone = new Point()
		clone.x = this.x
		clone.y = this.y
		return clone
	}

	//returns a copy of the current point with the coordinates multiplied by -1
	Point opposite(){
		Point opposite = new Point()
		opposite.x = this.x * -1
		opposite.y = this.y * -1
		return opposite
	}
}

Point myPoint = new Point()
Point anotherPoint = new Point()
myPoint.x = 1
myPoint.y = 3
anotherPoint.x = 1
anotherPoint.y = 1
println "Distance to another point " + myPoint.distanceTo(anotherPoint)
println "Distnace to origin " + myPoint.distanceToOrigin()
