
public class Service {
	
	private static Integer carArrival = 0;
	private static Integer carArrivalProbability = 0;
	private static Integer numberOfCars = 0;
	
	public void carService(Integer arrivalTime, Integer probabilityOne, Integer probabilityTwo) {
		PetrolStationInterface<String> queue = new PetrolStation<String>();
		
		final Integer serviceTimeOne = 3;
		final Integer serviceTimeTwo = 5;
		final Integer serviceTimeProbabilityOne = 65;
		final Integer serviceTimeProbabilityTwo = 35;
		Integer serviceProbabilityIncrementerOne = 0;
		Integer serviceProbabilityIncrementerTwo = 0;
		Integer serviceTime = 0;
		Integer pumpOne = 0;
		Integer pumpTwo = 0;

		for (int unitOfTime = 1; unitOfTime <= 120; unitOfTime++) {
			carArrivalProbability += 45;
			if (carArrivalProbability >= 100) {
				numberOfCars++;
				System.out.println("Car " + numberOfCars + " arrived");
				queue.enqueue("car" + numberOfCars);
				carArrivalProbability -= 100;
			}

			if (queue.count() > 0) {
				if (pumpOne == 0) {
					queue.dequeue();
					if (serviceTimeProbabilityOne >= serviceTimeProbabilityTwo) {
						serviceTime = serviceTimeOne;
						serviceProbabilityIncrementerOne -= 100;
					} else {
						serviceTime = serviceTimeTwo;
						serviceProbabilityIncrementerTwo -= 100;
					}
					pumpOne += serviceTime;
				} else {
					pumpOne--;
				}

				if (queue.count() > 2) {
					queue.dequeue();  //Extract to method calculate service time
					if (serviceTimeProbabilityOne >= serviceTimeProbabilityTwo) {
						serviceTime = serviceTimeOne;
						serviceProbabilityIncrementerOne -= 100;
					} else {
						serviceTime = serviceTimeTwo;
						serviceProbabilityIncrementerTwo -= 100;
					}
					pumpTwo += serviceTime;
				} else {
					pumpTwo--;
				}
			}
		}
	}
}
