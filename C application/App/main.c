#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

#include<conio.h>
#include<windows.h>

#include<ctype.h>


#define maxstring 50

COORD coord= {0,0};

typedef struct 
{
    int jour;
    int mois;
    int annee;
}
date;

typedef struct
{
    int Mle ;
    char MDP [maxstring];
    float Solde ;
}
user;

typedef struct
{
    int CodeTicket ;
    char Repas [maxstring];
    int Qte ;
    date DateTicket ;
}
ticket;

void add_user ();
int connect_all ();
void add_solde ();
void buy_ticket (int);
void verify_ticket ();

void gotoxy(int ,int );
void window(int,int,int,int);
int curser(int);
void highlight(int ,int);

int main ()
{
    system("mode con: cols=80 lines=30");

    int Mle;
    user solde ;
    user resto ;
    user student ;
    solde.Mle=1 ;
    resto.Mle=2 ;

    strcpy(solde.MDP , "solde123" ) ;
    strcpy(resto.MDP , "resto123" ) ;

    int choice;
    Menu:
    
    system("cls");
    window(22,53,12,20);
    
    gotoxy (32 ,10);
    printf("Login menu");
    char* loginMenu[]= {"    Se Connecter","    Cree un Compte","    Quitter le Programme"};
    for (int i=0; i<3; i++)
    {
        gotoxy(26,14+2*i);
        printf("%s",loginMenu[i]);
    }
    choice = curser(0);

    system("cls");
    switch (choice)
    {
    case 1:
        Mle=connect_all();
        break;
    case 2:
        add_user();
        goto Menu;
    case 3:
        return 1;
    default:
        printf("Choix invalide \nVeuillez reessayer\n");
        goto Menu;
    }
    if (Mle==solde.Mle)
    {
        add_solde();
        goto Menu;
    }
    if (Mle==resto.Mle)
    {
        verify_ticket();
        goto Menu;
    }
    buy_ticket(Mle);
    goto Menu ;
}

int connect_all ()
{
    user userd ;
    user userg ;

    FILE* users;

    char chaine [3 * maxstring];
    char mlestr [maxstring];
    start:
    fflush(stdin);
    system("cls");
    
    users = fopen("users.txt","a+");

    window(22,53,12,20);
    
    gotoxy (35 ,10);
    printf("LogIn");
    
    gotoxy(26,14);
    printf("Matricule : ");
    scanf("%d",&userg.Mle);
    gotoxy(26,16);
    printf("Mot de passe : ");
    scanf("%s",&userg.MDP);   

    while (fgets(chaine,3*maxstring,users))
    {
        sscanf (chaine , "%d %s" , &userd.Mle , userd.MDP );
        if (userd.Mle==userg.Mle)
        {
            if (!strcmp(userg.MDP,userd.MDP))
            {
                fclose(users);         
                gotoxy(22,23);
                printf("Connecte avec succes");
                getch();
                return userg.Mle ;
            }
            else
            {
                fclose(users);       
                gotoxy(22,23);
                printf("Mot de passe incorrect , veuillez reessayer");
                getch();
                goto start;
            }
        }
    }
    fclose(users);
    gotoxy(22,23);
    printf("Matricule incorrect , veuillez reessayer");
    getch();
    goto start;
}

void add_user ()
{
    user student ;
    FILE* users;
    users = fopen("users.txt","a+");
    system("cls");

    window(22,53,12,20);
    
    gotoxy (35 ,10);
    printf("SignIn");
    
    gotoxy(26,14);
    printf("Matricule : ");
    scanf("%d",&student.Mle);
    gotoxy(26,16);
    printf("Mot de passe : ");
    scanf("%s",&student.MDP);

    fprintf(users , "%d\t%s\t%d\n",student.Mle , student.MDP , 0);
    
    gotoxy(22,23);
    printf("Votre compte a ete ctree avec success");
    getch();
    fclose(users);
}

void add_solde ()
{
    user userd ;
    int Mle , check = 1 ;
    float solde ;
    char chaine [3 * maxstring];
    char mlestr [maxstring];

    fflush(stdin);
    system("cls");

    window(22,53,12,20);
    
    gotoxy (32 ,10);
    printf("Solde Menu");
    
    gotoxy(26,14);
    printf("Matricule : ");
    scanf("%d",&Mle);
    gotoxy(26,16);
    printf("Montant a ajouter : ");
    scanf("%f",&solde);
    
    FILE* users;
    users = fopen("users.txt","a+");

    FILE* temp;
    temp = fopen("temp.txt","a+");
   
    while (fgets(chaine,3*maxstring,users))
    {
        sscanf (chaine , "%d %s %f" , &userd.Mle , userd.MDP , &userd.Solde);
        if (userd.Mle!=Mle)
        {
            fprintf(temp,"%s",chaine);
        }
        else
        {
            userd.Solde+=solde;
            fprintf(temp , "%d\t%s\t%f\n" , userd.Mle , userd.MDP , userd.Solde);
            check=0;
        }
    }
    if(check)
    {
        gotoxy(22,23);
        printf("Matricule incorrect , veuillez reessayer");
        getch();
        fclose(users);
        fclose(temp);
        remove ("users.txt");
        rename("temp.txt" , "users.txt");
        add_solde();
    }
    else
    {
        fclose(users);
        fclose(temp);
        remove ("users.txt");
        rename("temp.txt" , "users.txt");
        gotoxy(22,23);
        printf("L'operation a ete effectue avec success");
        getch();
        add_solde();
    }
}

void buy_ticket (int Mle)
{
    ticket ticket1;
    int choice , solde;
    
    system("cls");
    window(20,55,12,20);
    
    gotoxy (32 ,10);
    printf("Ticket Menu");
    gotoxy(24,14);
    printf("Donnez la date du ticket sous");
    gotoxy(22,15);
    printf("la forme JJ MM AAAA : ");
    scanf("%d %d %d",&ticket1.DateTicket.jour , &ticket1.DateTicket.mois , &ticket1.DateTicket.annee);
    
    gotoxy(24,17);
    printf("Donnez le nombre de ticket");
    gotoxy(22,18);
    printf("que voulez acheter : ");
    scanf("%d", &ticket1.Qte);

    choice = curser(1);

    start :
    solde = 0 ;
    system("cls");
    window(22,53,12,20);
    
    gotoxy (28 ,10);
    printf("MealPlanner menu");
    gotoxy(26,14);
    printf("Choisez un repas :");
    char* loginMenu[]= {"    petit dejeuner","    dejeuner","    diner"};
    for (int i=0; i<3; i++)
    {
        gotoxy(26,16+i);
        printf("%s",loginMenu[i]);
    }
    choice = curser(1);
    switch (choice)
    {
    case 1:
        strcpy(ticket1.Repas,"petit_dejeuner");
        solde+=1*ticket1.Qte;
        break;
    case 2:
        strcpy(ticket1.Repas,"dejeuner");
        solde+=1.5*ticket1.Qte;
        break;
    case 3:
        strcpy(ticket1.Repas,"diner");
        solde+=1.5*ticket1.Qte;
        break;
    }

    char chaine [4 * maxstring];
    
    FILE* tickets;
    tickets=fopen("tickets.txt","a+");
    ticket ticket2;
    int check=0;
    srand(time(NULL)); 
    do 
    {
        ticket1.CodeTicket = rand() % 9000 + 1000;
        while (fgets(chaine,4*maxstring,tickets))
        {
            sscanf (chaine , "%d" , &ticket2.CodeTicket);
            if(ticket1.CodeTicket==ticket2.CodeTicket)
            {
                check=1;
            }
        }
    }
    while(check);

    user userd ;
    
    FILE* users;
    users = fopen("users.txt","a+");

    FILE* temp;
    temp = fopen("temp.txt","a+");
    while (fgets(chaine,3*maxstring,users))
    {
        sscanf (chaine , "%d %s %f" , &userd.Mle , userd.MDP , &userd.Solde);
        if (userd.Mle!=Mle)
        {
            fprintf(temp,"%s",chaine);
        }
        else
        {
            if (userd.Solde-solde>=0)
            {
                userd.Solde-=solde;
                fprintf(temp , "%d\t%s\t%f\n" , userd.Mle , userd.MDP , userd.Solde);
                gotoxy(22,23);
                printf("L'operation a ete effectue avec success.");
                gotoxy(22,24);
                printf("Votre code_ticket est :%d\n",ticket1.CodeTicket);
                getch();
            }

            else
            {
                gotoxy(22,23);
                printf("Solde insuffisant !! Vous devez charger votre compte");
                getch();
                fprintf(temp,"%s",chaine);
            }
        }
    }
    fclose(users);
    fclose(temp);
    remove ("users.txt");
    rename("temp.txt" , "users.txt");
    fclose(tickets);
    tickets=fopen("tickets.txt","a+");
    fprintf(tickets,"%d\t%d\t%s\t%d/%d/%d\n",ticket1.CodeTicket,ticket1.Qte,ticket1.Repas,ticket1.DateTicket.jour,ticket1.DateTicket.mois,ticket1.DateTicket.annee);
    fclose(tickets);

    buy_ticket(Mle);
}

void verify_ticket ()
{
    time_t current_time = time(NULL);
    struct tm *tm_struct = gmtime(&current_time);
    char date_string2[20],date_string1[20];
    strftime(date_string1, sizeof(date_string1), "%d/%m/%Y", tm_struct);

    ticket ticket1 ;
    ticket ticket2 ;

    fflush(stdin);
    system("cls");

    window(22,53,12,20);
    
    gotoxy (32 ,10);
    printf("Restorateur");
    
    gotoxy(24,14);
    printf("Donner le Code ticket : ");
    scanf("%d",&ticket1.CodeTicket);

    FILE* tickets;
    tickets=fopen("tickets.txt","a+");
    int check = 0;
    char chaine [4*maxstring];
    while (fgets(chaine,4*maxstring,tickets))
    {
        sscanf (chaine , "%d %d %s %s" , &ticket2.CodeTicket,&ticket2.Qte,ticket2.Repas,date_string2);
        if(ticket1.CodeTicket==ticket2.CodeTicket && !strcmp(date_string1,date_string2))
        {
            gotoxy(24,15);
            printf("Code ticket valide ");
            gotoxy(24,16);
            printf("%d repas de %s.", ticket2.Qte , ticket2.Repas );
            check = 1 ;
            getch();
        }
    }
    if (check == 0)
    {
        gotoxy(24,15);
        printf("Code ticket non valide ");
        getch();
    }
    fclose(tickets);
    verify_ticket();
}

void gotoxy(int x,int y)
{
    coord.X=x;
    coord.Y=y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),coord);
}

void window(int a,int b,int c,int d)
{
    int i;
    gotoxy(20,3);
    printf("******* Restoration Moderne *******");
    for (i=a; i<=b; i++)
    {
        gotoxy(i,9);
        printf("\xcd");
        gotoxy(i,11);
        printf("\xcd");
        gotoxy(i,c);
        printf("\xcd");
        gotoxy(i,d);
        printf("\xcd");
    }
    gotoxy(a,9);
    printf("\xc9");
    gotoxy(a,10);
    printf("\xba");
    gotoxy(a,11);
    printf("\xc8");
    gotoxy(b,9);
    printf("\xbb");
    gotoxy(b,10);
    printf("\xba");
    gotoxy(b,11);
    printf("\xbc");
    for(i=c; i<=d; i++)
    {
        gotoxy(a,i);
        printf("\xba");
        gotoxy(b,i);
        printf("\xba");
    }
    gotoxy(a,c);
    printf("\xc9");
    gotoxy(a,d);
    printf("\xc8");
    gotoxy(b,c);
    printf("\xbb");
    gotoxy(b,d);
    printf("\xbc");
}

int curser(int interf)
{
    int no=3;
    int count=1;
    char ch='0';
    gotoxy(30,23);
    while(1)
    {
        switch(ch)
        {
        case 80:
            count++;
            if (count==no+1) count=1;
            break;
        case 72:
            count--;
            if(count==0) count=no;
            break;
        }
        highlight(interf,count);
        fflush(stdin);
        ch=getch();
        if(ch=='\r')
        {
            return count;
        }
    }
}

void highlight(int interf,int count)
{
    int no=3;
    if (interf == 1)
    {
        system("cls");
        window(22,53,12,20);
        
        gotoxy (28 ,10);
        printf("Ticket menu");
        gotoxy(26,14);
        printf("Choisissez une option :");
        char* loginMenu[]= {"    petit dejeuner","    dejeuner","    diner"};
        for (int i=0; i<3; i++)
        {
            gotoxy(26,16+i);
            printf("%s",loginMenu[i]);
        }
        switch (count)
        {
        case 1:
            gotoxy(26,16);
            printf("1>> petit dejeuner");
            break;
        case 2:
            gotoxy(26,17);
            printf("2>> dejeuner");
            break;
        case 3:
            gotoxy(26,18);
            printf("3>> diner");
            break;
        }
    }
    if(interf==0)
    {
        char* loginMenu[]= {"    Se Connecter","    Cree un Compte","    Quitter le Programme"};
        for (int i=0; i<3; i++)
        {
            gotoxy(26,14+2*i);
            printf("%s",loginMenu[i]);
        }
        switch(count)
        {
        case 1:
            gotoxy (26,14);
            printf("1>> Se Connecter");
            break;
        case 2:
            gotoxy (26,16);
            printf("2>> Cree un Compte");
            break;
        case 3:
            gotoxy (26,18);
            printf("3>> Quitter le Programme");
            break;
        }
    }
}