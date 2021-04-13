if (x >= -Math.pow(2, 16) && x <= Math.pow(2, 16) - 1) {
                    System.out.println("* short");
                }

                if (x >= -Math.pow(2, 32) && x <= Math.pow(2, 32) - 1) {
                    System.out.println("* int");
                }

                if (x >= -Math.pow(2, 64) && x <= Math.pow(2, 64) - 1) {
                    System.out.println("* long");
                }