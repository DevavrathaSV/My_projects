# My_projects
# Player Messaging System

This Java project, named **Player Messaging System**, is a simple demonstration of a messaging system involving two players. The players can send and receive messages from each other. The project uses Maven for build and dependency management.

## Project Structure

The project consists of two main classes:

- `Player`: Represents a player in the messaging system.
- `Main`: Contains the main method to initialize players and demonstrate message sending and receiving.

## How to Run

To run the project, you can use the provided Bash script (`run.sh`) or follow these steps manually:

1. Open a terminal.

2. Navigate to the project's root directory.

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the project:

   ```bash
   java -cp target/PlayerMavenProject com.example.Main
   ```

## Usage

The `Player` class has the following methods:

- `sendingMessage(Player receivedMsg, String message)`: Allows a player to send a message to another player.
- `receivedMessage(Player sender, String message)`: Handles received messages and prints them.

In the `Main` class, two players (`initiator` and `Instance2`) are created. The `initiator` sends ten messages to `Instance2`. The messages are printed to the console.

## Example Output

Here is an example of the output when you run the project:

```
initiator Sent message: Hello from first_instance - count: 1
Instance2 Received message: Hello from first_instance - count: 1
initiator Sent message: Hello from first_instance - count: 2
Instance2 Received message: Hello from first_instance - count: 2
initiator Sent message: Hello from first_instance - count: 3
Instance2 Received message: Hello from first_instance - count: 3
initiator Sent message: Hello from first_instance - count: 4
Instance2 Received message: Hello from first_instance - count: 4
initiator Sent message: Hello from first_instance - count: 5
Instance2 Received message: Hello from first_instance - count: 5
initiator Sent message: Hello from first_instance - count: 6
Instance2 Received message: Hello from first_instance - count: 6
initiator Sent message: Hello from first_instance - count: 7
Instance2 Received message: Hello from first_instance - count: 7
initiator Sent message: Hello from first_instance - count: 8
Instance2 Received message: Hello from first_instance - count: 8
initiator Sent message: Hello from first_instance - count: 9
Instance2 Received message: Hello from first_instance - count: 9
initiator Sent message: Hello from first_instance - count: 10
Instance2 Received message: Hello from first_instance - count: 10
```

## Dependencies

This project does not have any external dependencies beyond the standard Java libraries.

## License

This project is provided under the MIT License. You can find more details in the `LICENSE` file.

Feel free to modify and extend this project for your own purposes.
