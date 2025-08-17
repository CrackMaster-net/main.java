import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerInput;
        int level;
        int choice;
        int health = 100;
        boolean enterToTheGame = false;
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the game, Adventurer!");
            System.out.println("This game is called \"The Great Adventure\"!");
            System.out.println("In this game, your decision making will be tested!");
            System.out.println("One wrong decision, will lead to the DEATH of your character!");
            System.out.print("You want to enter to the game? (1. Help? || 2. Maybe next time || 3. Yes, I'm all in!): ");
            playerInput = input.nextInt();

            if (playerInput == 1) {
                System.out.println("\n=== HELP ===");
                System.out.println("Choose numbers shown in the options.");
                System.out.println("1 = First option, 2 = Second option");
                System.out.println("Your choices matter. Some lead to death.");
                System.out.println("In Level 2, you have 100 health. Damage will reduce it.");
                System.out.print("Go back to the front page (0. Go Back): ");
                choice = input.nextInt();
                if (choice == 0) {
                    continue;
                } else {
                    System.out.println("Invalid input. Exiting...");
                    return;
                }
            } else if (playerInput == 2) {
                System.out.println("Exiting the game. See you next time, Adventurer.");
                return;
            } else if (playerInput == 3) {
                enterToTheGame = true;

                while (enterToTheGame) {
                    System.out.print("Please select level (1. Level 1 || 2. Level 2): ");
                    level = input.nextInt();

                    if (level == 1) {
                        System.out.println("\n=== LEVEL 1: The Blackpine Forest ===");
                        System.out.println("Welcome to the game, Adventurer!");
                        System.out.println("You are at level 1 — a perfect start… or so they say.");

                        System.out.println("The village elder has asked you to gather firewood before nightfall.");
                        System.out.println("But you waited too long…");
                        System.out.println("Now, as dusk falls, you stand at the edge of the Blackpine Forest —");
                        System.out.println("a place whispered about in hushed tones. No one goes in after dark…");
                        System.out.println("And yet… here you are.");

                        System.out.print("The last light fades behind you. (1. Step into the forest || 2. Turn back while you still can): ");
                        choice = input.nextInt();

                        if (choice == 1) {
                            System.out.print("The trees close behind you like prison bars. A cold wind whispers through the branches. (1. Keep walking quietly || 2. Call out to see if anyone's near): ");
                            choice = input.nextInt();

                            if (choice == 1) {
                                System.out.println("You move silently, gathering wood…");
                                System.out.println("But then—");
                                System.out.println("…a twig snaps in the distance.");
                                System.out.println("Something is watching you.");
                                System.out.print("You feel eyes on your back. (1. Ignore it and leave quickly || 2. Turn around and search the darkness): ");
                                choice = input.nextInt();

                                if (choice == 1) {
                                    System.out.println("You flee the forest with your bundle of wood. You made it… but did something follow you out?");
                                    System.out.print("(1. Quit || 2. Try Again): ");
                                    choice = input.nextInt();
                                    if (choice == 1) enterToTheGame = false;
                                    else if (choice == 2) continue;
                                    else System.out.println("Invalid choice. Returning to menu.");
                                } else if (choice == 2) {
                                    System.out.println("You turn slowly…");
                                    System.out.println("The forest is still. Too still.");
                                    System.out.println("No birds. No wind.");
                                    System.out.println("Then— a rustle. Deep in the trees.");
                                    System.out.print("You’re lost now. (1. Try to retrace your steps || 2. Sit down and wait for morning): ");
                                    choice = input.nextInt();

                                    if (choice == 1) {
                                        System.out.println("You stumble through the dark…");
                                        System.out.println("Just as hope fades, a lantern appears ahead.");
                                        System.out.println("It’s Tomas, the old woodcutter! He smiles and waves you over.");
                                        System.out.println("Together, you escape the forest.");
                                        System.out.print("(1. Quit || 2. Try Again): ");
                                        choice = input.nextInt();
                                        if (choice == 1) enterToTheGame = false;
                                        else if (choice == 2) continue;
                                        else System.out.println("Invalid choice.");
                                    } else if (choice == 2) {
                                        System.out.print("You sit against a tree, shivering. Then— a whisper. Right beside your ear. (1. Scream and run || 2. Hold your breath and pretend you’re not there): ");
                                        choice = input.nextInt();

                                        if (choice == 1) {
                                            System.out.println("You bolt through the trees—");
                                            System.out.println("But your foot catches on a root.");
                                            System.out.println("You fall…");
                                            System.out.println("Your head strikes a rock.");
                                            System.out.println("The last thing you hear is laughter… coming from the shadows.");
                                            System.out.println("You died.");
                                            System.out.print("(1. Quit || 2. Try Again): ");
                                            choice = input.nextInt();
                                            if (choice == 1) enterToTheGame = false;
                                            else if (choice == 2) continue;
                                            else System.out.println("Invalid choice.");
                                        } else if (choice == 2) {
                                            System.out.println("You don’t move. You don’t breathe. The whispering stops…");
                                            System.out.println("Then— a voice shouts from the edge of the forest!");
                                            System.out.println("‘HEY! IS SOMEONE OUT THERE?’");
                                            System.out.print("(1. Stay silent — what if it’s not human? || 2. Shout back for help): ");
                                            choice = input.nextInt();

                                            if (choice == 1) {
                                                System.out.println("You stay silent…");
                                                System.out.println("The footsteps pass by…");
                                                System.out.println("But as dawn breaks, you find strange footprints around you —");
                                                System.out.println("All facing inward.");
                                                System.out.println("You made it out… but you’re not the same.");
                                                System.out.println("And something… is missing from your pocket.");
                                                System.out.print("(1. Quit || 2. Try Again): ");
                                                choice = input.nextInt();
                                                if (choice == 1) enterToTheGame = false;
                                                else if (choice == 2) continue;
                                                else System.out.println("Invalid choice.");
                                            } else if (choice == 2) {
                                                System.out.println("You scream for help—");
                                                System.out.println("Footsteps rush toward you.");
                                                System.out.println("A torchlight appears.");
                                                System.out.println("It’s the village guard! You’re saved!");
                                                System.out.print("(1. Quit || 2. Try Again): ");
                                                choice = input.nextInt();
                                                if (choice == 1) enterToTheGame = false;
                                                else if (choice == 2) continue;
                                                else System.out.println("Invalid choice.");
                                            }
                                        }
                                    }
                                }
                            } else if (choice == 2) {
                                System.out.println("Your voice echoes unnaturally —");
                                System.out.println("Like the forest swallowed it… and returned a distorted version.");
                                System.out.println("Silence follows.");
                                System.out.println("Then—");
                                System.out.println("…a voice, mimicking your words, whispers back: '…back… back… back…'");
                                System.out.print("Panic sets in. (1. Run blindly || 2. Stand your ground and demand answers): ");
                                choice = input.nextInt();

                                System.out.println("You can't tell what's real anymore. The forest plays tricks on your mind.");
                                System.out.println("You collapse from fear… and are never seen again.");
                                System.out.println("💀 You died.");
                                System.out.print("(1. Quit || 2. Try Again): ");
                                choice = input.nextInt();
                                if (choice == 1) enterToTheGame = false;
                                else if (choice == 2) continue;
                                else System.out.println("Invalid choice.");
                            }
                        } else if (choice == 2) {
                            System.out.println("You turn back. The village lights glow warmly in the distance.");
                            System.out.println("You made the safe choice…");
                            System.out.println("But tonight, you’ll dream of glowing eyes in the trees… watching… waiting.");
                            System.out.print("(1. Quit || 2. Try Again): ");
                            choice = input.nextInt();
                            if (choice == 1) enterToTheGame = false;
                            else if (choice == 2) continue;
                            else System.out.println("Invalid choice.");
                        }

                    } else if (level == 2) {
                        System.out.println("\n=== LEVEL 2: The Isolated Island ===");
                        health = 100; // Reset health for Level 2
                        System.out.println("Here, you have " + health + " health.");
                        System.out.println("You must finish Level 1 before proceeding, but we trust you did.");
                        System.out.println("You are a warrior assigned to eliminate a monster on a remote island.");

                        System.out.println("You arrived at the island.");
                        System.out.print("The commander lets you pick a weapon (1. Bow || 2. Sword): ");
                        choice = input.nextInt();

                        String weapon = "";
                        if (choice == 1) {
                            weapon = "Bow";
                            System.out.println("You chose the Bow. You feel precise and ready.");
                        } else if (choice == 2) {
                            weapon = "Sword";
                            System.out.println("You chose the Sword. You feel strong and close to the fight.");
                        } else {
                            System.out.println("Invalid choice. Defaulting to Sword.");
                            weapon = "Sword";
                        }

                        System.out.println("Current Health: " + health);

                        System.out.println("You trek through the misty jungle. The air is thick and silent.");
                        System.out.println("Suddenly, you hear a child crying…");

                        System.out.print("You approach slowly. A young child, no older than 8, sits alone. (1. Comfort the child || 2. Stay cautious): ");
                        choice = input.nextInt();

                        if (choice == 1) {
                            System.out.println("You kneel down. 'It's okay, I'll protect you.'");
                            System.out.println("The child looks up… their eyes are pitch black.");
                            System.out.println("Their mouth stretches into a grotesque grin.");
                            System.out.println("'Thank you… for coming so close…'");
                            System.out.println("They lunge at you!");

                            if (weapon.equals("Bow")) {
                                System.out.println("You barely dodge! But you're too slow to draw your bow at this range.");
                                health -= 40;
                            } else if (weapon.equals("Sword")) {
                                System.out.println("You draw your sword and slash! The creature screeches and retreats.");
                                System.out.println("You wounded it!");
                                health -= 20;
                            }

                            System.out.println("Current Health: " + health);
                        } else if (choice == 2) {
                            System.out.println("You keep your distance. Something feels… off.");
                            System.out.println("The child stops crying. They tilt their head unnaturally.");
                            System.out.println("'Why won't you help me?' they whisper — but their voice echoes like many.");
                            System.out.print("You ready your weapon. (1. Shoot with Bow || 2. Charge with Sword): ");
                            choice = input.nextInt();

                            if (choice == 1 && weapon.equals("Bow")) {
                                System.out.println("You fire! The arrow strikes the child —");
                                System.out.println("— but it passes through, and the child vanishes in smoke.");
                                System.out.println("A monstrous roar erupts from behind you!");
                                health -= 30;
                            } else if (choice == 2 && weapon.equals("Sword")) {
                                System.out.println("You charge! But the child disappears in a blink.");
                                System.out.println("You swing at nothing. Suddenly, sharp claws rake your back!");
                                health -= 50;
                            } else {
                                System.out.println("You hesitate…");
                                System.out.println("The child laughs — a sound like breaking glass.");
                                System.out.println("Pain explodes across your body!");
                                health -= 60;
                            }

                            System.out.println("Current Health: " + health);
                        }

                        if (health <= 0) {
                            System.out.println("You collapse, vision fading.");
                            System.out.println("The child walks up, now towering and monstrous.");
                            System.out.println("'We are many,' it whispers. 'And you were just another meal.'");
                            System.out.println("💀 You died.");
                            System.out.print("(1. Quit || 2. Try Again): ");
                            choice = input.nextInt();
                            if (choice == 1) enterToTheGame = false;
                            else if (choice == 2) continue;
                            else System.out.println("Invalid choice.");
                            continue;
                        }

                        System.out.println("The creature reveals itself — a shapeshifting horror, born from fear.");
                        System.out.println("It circles you, hissing: 'You cannot kill what you cannot see.'");

                        System.out.print("Final battle! (1. Aim carefully with " + weapon + " || 2. Fight aggressively): ");
                        choice = input.nextInt();

                        if (weapon.equals("Bow") && choice == 1) {
                            System.out.println("You steady your breath…");
                            System.out.println("You fire a perfect shot into its glowing eye!");
                            System.out.println("The monster screams and collapses into mist.");
                            System.out.println("You did it! The island is safe… for now.");
                        } else if (weapon.equals("Sword") && choice == 2) {
                            System.out.println("You roar and charge, slashing wildly!");
                            System.out.println("One strike lands true — the monster shrieks and explodes into shadows.");
                            System.out.println("You stand victorious, covered in sweat and blood.");
                        } else {
                            System.out.println("You miss your chance…");
                            System.out.println("The monster wraps around you like smoke.");
                            System.out.println("Your bones crack. Your vision fades.");
                            System.out.println("💀 You died.");
                            health = 0;
                        }

                        if (health > 0) {
                            System.out.println("Final Health: " + health);
                            System.out.println("You return to the commander. They nod in respect.");
                            System.out.println("But you can’t forget the child’s face…");
                            System.out.println("…and sometimes, at night, you hear faint crying.");
                        }

                        System.out.print("(1. Quit || 2. Try Again): ");
                        choice = input.nextInt();
                        if (choice == 1) enterToTheGame = false;
                        else if (choice == 2) continue;
                        else System.out.println("Invalid choice.");

                    } else {
                        System.out.println("Please input a valid level (1 or 2).");
                    }
                }
            } else {
                System.out.println("Please input a valid action (1, 2, or 3).");
            }
        }
    }
}
