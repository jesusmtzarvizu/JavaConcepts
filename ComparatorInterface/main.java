ArrayList<Person> p=new ArrayList<Person>();

        p.add(new Person("jorge","jimenez",8));
        p.add(new Person("jesus","arvizu",3));
        p.add(new Person("alejandra","perez",5));
        p.add(new Person("aaaa","ttt",2));

        System.out.println("Sorting by Name...");

        Collections.sort(p,new NameComparator());
        for(Person st: p){
            System.out.println(st.name+" "+st.lastName+" "+st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(p,new AgeComparator());
        for(Person st: p){
            System.out.println(st.name+" "+st.lastName+" "+st.age);
        }


    }
