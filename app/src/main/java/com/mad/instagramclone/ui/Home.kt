package com.mad.instagramclone.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mad.instagramclone.R
import com.mad.instagramclone.ui.theme.InstagramCloneTheme
import com.mad.instagramclone.ui.theme.lobster

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){
    Scaffold(
        topBar = { HomeAppBar() },
        bottomBar = { BottomNavigationBar() }
    ) {paddingValues ->

        Column(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
            Column {

                //Story
                Row(
                    modifier = Modifier
                        .padding(
                            top = 16.dp,
                            bottom = 16.dp,
                            start = 0.dp,
                            end = 0.dp
                        )
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    YourStory(
                        imageUrl = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8UGVvcGxlfGVufDB8fDB8fHww",
                        name = "Your Story"
                    )
                    Story(
                        imageUrl = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8UHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D",
                        name = "o_donnel"
                    )
                    Story(
                        imageUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8UHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D",
                        name = "cho"
                    )
                    Story(
                        imageUrl = "https://images.unsplash.com/photo-1500648767791-00dcc994a43e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8UHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D",
                        name = "gonzalez"
                    )



                }

                //Main Content 1
                HomeMainContent()

                //Main Content 2
                HomeMainContent()

                //Main Content 3
                HomeMainContent()

            }


        }

    }


}

@Composable
fun HomeMainContent(){
    // Create a surface with padding on the top and bottom
    Surface(modifier = Modifier.padding(top=6.dp, bottom = 6.dp)) {
        // Create a column to hold the content
        Column {
            // Create a row to hold the profile picture, username, and more options icon
            Row(
                Modifier
                    .fillMaxWidth() // Fill the width of the parent
                    .padding(start = 6.dp, end = 6.dp, bottom = 8.dp), // Add padding around the row
                verticalAlignment = Alignment.CenterVertically // Center the children vertically
            ) {
                // Create a column to hold the profile picture
                Column(
                    Modifier
                        .weight(1f) // Take up 1/8 of the row's width
                        .padding(end = 16.dp) // Add padding to the end of the column
                ) {
                    // Load the profile picture asynchronously
                    AsyncImage(
                        model = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8UHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D",
                        contentDescription = null, // No content
                        modifier = Modifier
                            .size(30.dp) // Set the size of the image to 30dp
                            .clip(CircleShape) // Clip the image to a circle shape
                            .border( // Add a border to the image
                                width = 2.dp, // The width of the border is 2dp
                                brush = Brush.linearGradient( // The color of the border is a linear gradient
                                    colors = listOf(Color.Yellow, Color.Red), // The colors of the gradient
                                    start = Offset(0f, 0f), // The start point of the gradient
                                    end = Offset(70f, 70f) // The end point of the gradient
                                ),
                                shape = CircleShape // The shape of the border is a circle
                            )
                            .clickable(onClick = {}), // Make the image clickable
                        contentScale = ContentScale.Crop // Crop the image to fill the size of the ImageView
                    )
                }

                // Create a column to hold the username and audio source
                Column(
                    Modifier
                        .weight(6f) // Take up 6/8 of the row's width
                        .padding(end = 16.dp) // Add padding to the end of the column
                ) {
                    // Display the username
                    Text(
                        text = "o_donnel", // The username
                        fontWeight = FontWeight.Normal, // The font weight is normal
                        fontSize = 11.sp // The font size is 11sp
                    )
                    // Display the audio source
                    Text(
                        text = "o_donnel  •  Original audio", // The audio source
                        fontWeight = FontWeight.Normal, // The font weight is normal
                        fontSize = 10.sp // The font size is 10sp
                    )
                }
                // Create a box to hold the more options icon
                Box(
                    modifier = Modifier.weight(1f), // Take up 1/8 of the row's width
                    contentAlignment = Alignment.CenterEnd // Center the icon at the end of the box
                ) {
                    // Display the more options icon
                    Icon(Icons.Default.MoreVert,
                        contentDescription = null, // No content description is provided
                        modifier = Modifier.size(26.dp)) // Set the size of the icon to 26dp
                }
            }

            //Image / Video
            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState()) // Enable horizontal scrolling
                    .fillMaxWidth(), // Fill the width of the parent

            ) {
                // Replace with your list of image URLs
                val images = listOf(
                    "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8UGVvcGxlfGVufDB8fDB8fHww",
                    "https://images.unsplash.com/photo-1517841905240-472988babdf9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fFByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww",
                    "https://images.unsplash.com/photo-1500648767791-00dcc994a43e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8UHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D"
                )

                // Call the ImageScrollWithTextOverlay function with the list of images
                ImageScrollWithTextOverlay(images)
            }

            // Content (Reactions)
            Row(
                modifier = Modifier.fillMaxWidth(), // Fill the width of the parent
                horizontalArrangement = Arrangement.SpaceBetween // Arrange the children with space between them
            ) {
                // Create a row to hold the reaction icons
                Row {
                    // Create an icon button for likes
                    IconButton(onClick = {  }) {
                        Icon(
                            painter = painterResource(R.drawable.heart_thin_icon), // Use the heart icon resource
                            contentDescription = "Like Icon", // Provide a description for accessibility
                            modifier = Modifier.size(20.dp) // Set the size of the icon to 20dp
                        )
                    }

                    // Create an icon button for comments
                    IconButton(onClick = {  }) {
                        Icon(
                            painter = painterResource(R.drawable.instagram_comment_icon), // Use the comment icon resource
                            contentDescription = "Comment Icon", // Provide a description for accessibility
                            modifier = Modifier.size(20.dp) // Set the size of the icon to 20dp
                        )
                    }

                    // Create an icon button for share
                    IconButton(onClick = {  }) {
                        Icon(
                            painter = painterResource(R.drawable.instagram_share_icon), // Use the share icon resource
                            contentDescription = "Share Icon", // Provide a description for accessibility
                            modifier = Modifier.size(20.dp) // Set the size of the icon to 20dp
                        )
                    }
                }

                // Create an icon button for save
                IconButton(onClick = {  }) {
                    Icon(
                        painter = painterResource(R.drawable.saved_icon), // Use the save icon resource
                        contentDescription = "Save Icon", // Provide a description for accessibility
                        modifier = Modifier.size(20.dp) // Set the size of the icon to 20dp
                    )
                }
            }

// Create a column to hold the likes, comments, and timestamp
            Column(modifier = Modifier.padding(
                start = 10.dp,
                end = 10.dp,
                top = 1.dp,
                bottom =4.dp
            )) {
                // Display the number of likes
                Row{
                    Text(
                        text = "2993 likes",
                        fontWeight = FontWeight.Bold, // The font weight is bold
                        fontSize = 15.sp // The font size is 15sp
                    )
                }

                // Display the comments
                Row{
                    Text(
                        text = "o_donnel ", // The username
                        fontWeight = FontWeight.Bold, // The font weight is bold
                        fontSize = 15.sp // The font size is 15sp
                    )
                    Text(
                        text = "Discover new people", // The comment
                        fontWeight = FontWeight.Normal, // The font weight is normal
                        fontSize = 13.sp // The font size is 13sp
                    )
                }

                // Display the total number of comments
                Row{
                    Text(text = "view all 138 comments",
                        fontWeight = FontWeight.Thin, // The font weight is thin
                        fontSize = 13.sp // The font size is 13sp
                    )
                }

                // Display the timestamp
                Row{
                    Text(text = "9 minutes ago",
                        fontWeight = FontWeight.Thin, // The font weight is thin
                        fontSize = 13.sp // The font size is 13sp
                    )
                }
            }



        }
    }
}

@Composable
fun ImageScrollWithTextOverlay(images: List<String>) {
    // Get the screen width from the local configuration
    val screenWidth = LocalConfiguration.current.screenWidthDp

    // Loop over each image in the list
    images.forEachIndexed { index, imageUrl ->
        // Create a box for each image
        Box(
            modifier = Modifier
                .width(screenWidth.dp) // Set the width of the box to the screen width
                .aspectRatio(1f) // Set the aspect ratio of the box to 1 (for a square box)
        ) {
            // Load the image asynchronously
            AsyncImage(
                model = imageUrl, // The URL of the image
                contentDescription = null, // No content description is provided
                modifier = Modifier.fillMaxWidth(), // Fill the width of the parent
                contentScale = ContentScale.FillWidth // Scale the image to fill the width of the ImageView
            )

            // Display the image index and total number of images
            Text(
                text = "${index + 1}/${images.size}", // The text to display
                color = Color.White, // The color of the text is white
                modifier = Modifier
                    .align(Alignment.TopEnd) // Align the text to the top end of the box
                    .padding(4.dp) // Add padding around the text
            )
        }
    }
}



// Opt-in to use experimental Material 3 API
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar(){
    // Create a top app bar
    TopAppBar(
        // Set the title of the app bar
        title = {
            Text(
                "Instagram", // The text to display
                fontFamily = lobster, // Use the custom font family "lobster"
                fontWeight = FontWeight.Bold, // Set the font weight to bold
                fontSize = 25.sp, // Set the font size to 25sp
            )
        },
        // Define the actions to include in the app bar
        actions = {
            // Create an icon button with a heart icon
            IconButton(onClick = {  }) {
                Icon(
                    painter = painterResource(R.drawable._025703_heart_icon), // Use the heart icon resource
                    contentDescription = "Heart Icon", // Provide a description for accessibility
                    modifier = Modifier.size(24.dp) // Set the size of the icon to 24dp
                )
            }
            // Create an icon button with a messenger icon
            IconButton(onClick = {  }) {
                Icon(
                    painter = painterResource(R.drawable._959746_chat_communication_facebook_messenger_icon), // Use the messenger icon resource
                    contentDescription = "Messenger Icon", // Provide a description for accessibility
                    modifier = Modifier.size(24.dp) // Set the size of the icon to 24dp
                )
            }
        }
    )
}


// Your Story Section
@Composable
fun YourStory(imageUrl: String, name: String) {
    // Create a column to hold the story image and name
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // Center the children horizontally
        verticalArrangement = Arrangement.spacedBy(8.dp) // Space the children vertically by 8dp
    ) {
        // Create a box to hold the story image and the add icon
        Box(
            modifier = Modifier
                .size(70.dp) // Set the size of the box to 70dp
                .clickable(onClick = {}) // Make the box clickable
        ) {
            // Load the story image asynchronously
            AsyncImage(
                model = imageUrl, // The URL of the image
                contentDescription = null, // No content description is provided
                modifier = Modifier.clip(CircleShape), // Clip the image to a circle shape
                contentScale = ContentScale.Crop // Crop the image to fill the size of the ImageView
            )
            // Display the add icon
            Icon(
                Icons.Default.AddCircle, // The add icon
                contentDescription = null, // No content description is provided
                modifier = Modifier
                    .align(Alignment.BottomEnd), // Align the icon to the bottom end of the box
                tint = Color(0xFF2196F3) // Set the color of the icon to blue
            )
        }
        // Display the name of the story
        Text(
            text = name, // The name of the story
            fontWeight = FontWeight.Normal, // The font weight is normal
            fontSize = 13.sp // The font size is 13sp
        )
    }
}


// Other Story Section
@Composable
fun Story(imageUrl: String, name: String) {
    // Create a column to hold the story image and name
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // Center the children horizontally
        verticalArrangement = Arrangement.spacedBy(8.dp) // Space the children vertically by 8dp
    ) {
        // Load the story image asynchronously
        AsyncImage(
            model = imageUrl, // The URL of the image
            contentDescription = null, // No content description is provided
            modifier = Modifier
                .size(70.dp) // Set the size of the image to 70dp
                .clip(CircleShape) // Clip the image to a circle shape
                .border( // Add a border to the image
                    width = 2.dp, // The width of the border is 2dp
                    brush = Brush.linearGradient( // The color of the border is a linear gradient
                        colors = listOf(Color.Yellow, Color.Red), // The colors of the gradient
                        start = Offset(0f, 0f), // The start point of the gradient
                        end = Offset(70f, 70f) // The end point of the gradient
                    ),
                    shape = CircleShape // The shape of the border is a circle
                )
                .clickable(onClick = {}), // Make the image clickable
            contentScale = ContentScale.Crop // Crop the image to fill the size of the ImageView
        )
        // Display the name of the story
        Text(
            text = name, // The name of the story
            fontWeight = FontWeight.Normal, // The font weight is normal
            fontSize = 13.sp // The font size is 13sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun HomeAppBarPreview(){
    InstagramCloneTheme {
        HomeAppBar()
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview(){
    InstagramCloneTheme {
        Home()
    }
}

@Preview
@Composable
fun HomeDarkPreview(){
    InstagramCloneTheme(darkTheme = true) {
        Home()
    }
}


@Composable
fun BottomNavigationBar() {
    // Create a bottom app bar
    BottomAppBar {
        // Create a row to hold the icons
        Row(
            modifier = Modifier.fillMaxWidth(), // Fill the width of the parent
            horizontalArrangement = Arrangement.SpaceEvenly // Arrange the icons evenly
        ) {
            // Create an icon button for home
            IconButton(onClick = { /* do something */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(painter = painterResource(R.drawable._912908791641180048), contentDescription = "Home Icon", modifier = Modifier.size(25.dp))
                }
            }
            // Create an icon button for search
            IconButton(onClick = { /* do something */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(painter = painterResource(R.drawable.search_line_icon), contentDescription = "Search Icon", modifier = Modifier.size(25.dp))
                }
            }
            // Create an icon button for add
            IconButton(onClick = { /* do something */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(painter = painterResource(R.drawable.plus_square_line_icon), contentDescription = "Add Icon", modifier = Modifier.size(25.dp))
                }
            }
            // Create an icon button for media
            IconButton(onClick = { /* do something */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    Icon(painter = painterResource(R.drawable._6977127916352314864510), contentDescription = "Media Icon", modifier = Modifier.size(28.dp))
                }
            }
            // Create an icon button for profile picture
            IconButton(onClick = { /* do something */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    AsyncImage(
                        model = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8UGVvcGxlfGVufDB8fDB8fHww",
                        contentDescription = null,
                        modifier = Modifier
                            .size(27.dp)
                            .clip(CircleShape) // Clip the image to a circle shape
                            .border(
                                width = 2.dp,
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Yellow, Color.Red),
                                    start = Offset(0f, 0f),
                                    end = Offset(70f, 70f)
                                ),
                                shape = CircleShape
                            )
                            .clickable(onClick = {}), // Make the image clickable
                        contentScale = ContentScale.Crop // Crop the image to fill the size of the ImageView
                    )
                }
            }
        }
    }
}
